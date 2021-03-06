package com.ltse.gui.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class UIUtils {
  public static final UIUtils INSTANCE = new UIUtils();
  public static final String PROPERTY_RESOURCE_BUNDLE = "com.ltse.gui.resources.globalMessages";
  private final static BufferedReader reader = new BufferedReader(
    new InputStreamReader(System.in)
  );
  private static ResourceBundle bundle;

  private UIUtils() {
    UIUtils.bundle = ResourceBundle.getBundle(PROPERTY_RESOURCE_BUNDLE);
  }

  public static String getText(String key) {
    System.out.println();
    String text = null;
    if (text == null) {
      try {
        text = bundle.getString(key);
      } catch (MissingResourceException exc) {
          text = key;
        }
      }
      return text;
  }
}
