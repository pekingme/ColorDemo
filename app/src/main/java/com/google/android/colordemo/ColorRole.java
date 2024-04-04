package com.google.android.colordemo;

import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;

final class ColorRole {

  @StringRes
  private final int colorRoleStringResId;
  @ColorRes
  private final int colorRoleColorResId;

  ColorRole(@StringRes int colorRoleStringResId, @ColorRes int colorRoleColorResId) {
    this.colorRoleStringResId = colorRoleStringResId;
    this.colorRoleColorResId = colorRoleColorResId;
  }

  void addTo(@NonNull LinearLayout layout) {
    Context context = layout.getContext();
    TextView colorRoleView = new TextView(context);
    colorRoleView.setText(colorRoleStringResId);
    colorRoleView.setMinLines(2);
    int backgroundColor = context.getResources().getColor(colorRoleColorResId,
        context.getTheme());
    colorRoleView.setBackgroundColor(backgroundColor);
    Color color = Color.valueOf(backgroundColor);
    if(color.luminance() < 0.3f){
      colorRoleView.setTextColor(Color.WHITE);
    }else{
      colorRoleView.setTextColor(Color.BLACK);
    }
    layout.addView(colorRoleView);
  }
}