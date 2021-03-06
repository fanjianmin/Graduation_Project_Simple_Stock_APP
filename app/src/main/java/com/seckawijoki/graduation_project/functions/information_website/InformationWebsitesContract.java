package com.seckawijoki.graduation_project.functions.information_website;
/**
 * Created by 瑶琴频曲羽衣魂 on 2018/2/13 at 14:35.
 */

import android.app.Activity;
import android.support.v4.app.Fragment;

interface InformationWebsitesContract {
  interface View {
    void onPresenterInitiate();
    void destroy();
    void setActionCallback(ActionCallback callback);
    interface ActionCallback {

    }
  }

  interface Model {
    void onViewInitiate();
    void destroy();
    void setDataCallback(DataCallback callback);
    interface DataCallback {

    }
  }

  interface Presenter {
    Presenter initiate();
    void destroy();
    Presenter setView(View view);
    Presenter setModel(Activity activity);
  }
}
