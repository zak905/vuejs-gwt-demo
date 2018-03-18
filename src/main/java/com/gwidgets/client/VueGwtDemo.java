package com.gwidgets.client;

import com.axellience.vuegwt.core.client.Vue;
import com.axellience.vuegwt.core.client.VueGWT;
import com.google.gwt.core.client.EntryPoint;

public class VueGwtDemo implements EntryPoint {
  public void onModuleLoad() {
    VueGWT.init();
    VueGWT.initWithoutVueLib();

    Vue.attach("#app", AppComponent.class);
  }
}
