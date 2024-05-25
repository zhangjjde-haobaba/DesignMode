package com.kgc.responsibility;



/**
 * Created by jiang on 9/6/23 12:08 PM
 */
public abstract class PostHandler {
    //保存下一个节点的信息
    private PostHandler handler;

    public void setHandler(PostHandler handler) {
        this.handler = handler;
    }

    public abstract void handlerRequest(Post post);

    protected final void next(Post post){
        if(this.handler !=null){
            this.handler.handlerRequest(post);
        }

    }


}
