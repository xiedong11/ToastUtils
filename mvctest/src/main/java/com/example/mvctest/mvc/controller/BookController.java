package com.example.mvctest.mvc.model;

import com.example.mvctest.R;
import com.example.mvctest.mvc.bean.BookBean;

/**
 * 控制器（Controller层）：根据Model层的方法，加上我们的业务逻辑处理，对外提供方法并暴露接口
 * 看delete这个方法，判断List是否为空（业务逻辑），使用mode.deleteBook()（Model层方法），通过listener.onComplete()（暴露接口）
 *
 * Created by xiedong on 2017/9/28.
 */

public class BookController {
    private BookModel model;
    public BookController(){
        model = new BookModel();
    }

    public void addBook(OnAddBookListener listener){
        model.addBook("add_book", R.mipmap.ic_launcher);
        if (listener!=null){
            listener.success();
        }
    }

    public interface OnAddBookListener{
        void success();
    }
}
