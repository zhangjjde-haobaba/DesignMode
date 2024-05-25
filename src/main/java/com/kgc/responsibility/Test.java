package com.kgc.responsibility;

/**
 * Created by jiang on 9/6/23 12:19 PM
 */
public class Test {
    public static void main(String[] args) {
        PostHandler a = new HandlerA();
        PostHandler b = new BHandler();
        a.setHandler(b); // A->B
        Post post = new Post();
        post.setContent("正常内容，广告内容，游戏推广");
        System.out.println("过滤前内容:"+post.getContent());
        a.handlerRequest(post);
        System.out.println("过滤后的内容:"+post.getContent());
    }
}
