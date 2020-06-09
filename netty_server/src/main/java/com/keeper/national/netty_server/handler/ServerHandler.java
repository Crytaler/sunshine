package com.keeper.national.netty_server.handler;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @ClassName ServerHandler
 * @Descriptino TODO
 * @Author myzhen
 * @Date 2020/6/9 上午11:19
 * @Version 1.0
 **/
public class ServerHandler extends ChannelInboundHandlerAdapter {
    private static ChannelGroup channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception{
        channels.add(ctx.channel());//加入ChannelGroup
        System.out.println(ctx.channel().id()+" come into the chattingroom,"+"Online: "+channels.size());
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext context){
        System.out.println(context.channel().id()+" left the chattingroom,"+"Online: "+channels.size());
    }
    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        ctx.writeAndFlush("马永振");
    }
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //打印消息然后群发
        System.out.println(msg.toString());
//        for (Channel channel:channels){
//            channel.writeAndFlush(msg.toString());
//        }
        sendMessage(ctx);

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println(ctx.channel().id()+" occurred into error,"+"Online: "+channels.size());
        ctx.close();
    }

    //给固定的人发消息
    private void sendMessage(ChannelHandlerContext ctx) {
        String message = "你好，"+ctx.channel().localAddress()+" 给固定的人发消息";
        ctx.channel().writeAndFlush(new TextWebSocketFrame(message));
    }

    //发送群消息,此时其他客户端也能收到群消息
    private void sendAllMessage(Object msg){
        String message = "我是服务器，这里发送的是群消息";
        for (Channel channel:channels){
            channel.writeAndFlush(msg.toString());
        }
//        channels.writeAndFlush( new TextWebSocketFrame(message));
    }
}
