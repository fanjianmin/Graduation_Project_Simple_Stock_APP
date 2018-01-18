package com.seckawijoki.graduation_project.functions.information;


/**
 * Created by 瑶琴频曲羽衣魂 on 2017/10/24.
 */

interface InformationContract {
  interface View   {
    void initiate();
    void destroy();
    void setActionCallback(ActionCallback callback);

    interface ActionCallback {

    }
  }

  interface Model   {
    void initiate();
    void destroy();
    void setDataCallback(DataCallback callback);

    interface DataCallback {

    }
  }

  interface Presenter   {
    void initiate();
    void destroy();
    void setView(View view);

    void setModel(Model model);
  }
}