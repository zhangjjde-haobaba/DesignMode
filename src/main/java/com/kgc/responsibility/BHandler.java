package com.kgc.responsibility;

/**
 * Created by jiang on 9/6/23 12:17 PM
 */
public class BHandler extends PostHandler {
    public void handlerRequest(Post post) {
        String content = post.getContent();
        content = content.replace("游戏推广","**");
        post.setContent(content);
        System.out.println("游戏推广过滤");
        next(post);
    }
}
