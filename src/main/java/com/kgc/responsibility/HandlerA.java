package com.kgc.responsibility;

/**
 * Created by jiang on 9/6/23 12:14 PM
 */
public class HandlerA extends PostHandler {

    public void handlerRequest(Post post) {
        String content = post.getContent();
        content = content.replace("广告","**");
        post.setContent(content);
        System.out.println("过滤广告");
        next(post);

    }
}
