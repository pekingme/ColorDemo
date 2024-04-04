package com.google.android.colordemo;

import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    LinearLayout systemColorsLayout = findViewById(R.id.system_colors_layout);
    LinearLayout dynamicPalettesLayout = findViewById(R.id.dynamic_palettes_layout);

    for (ColorRole colorRole : getSystemColors()) {
      colorRole.addTo(systemColorsLayout);
    }
    for (ColorRole colorRole : getDynamicPalettes()) {
      colorRole.addTo(dynamicPalettesLayout);
    }
  }

  private List<ColorRole> getSystemColors() {
    return Arrays.asList(
        // Light colors
        new ColorRole(R.string.light_primary, android.R.color.system_primary_light),
        new ColorRole(R.string.light_on_primary, android.R.color.system_on_primary_light),
        new ColorRole(R.string.light_primary_container,
            android.R.color.system_primary_container_light),
        new ColorRole(R.string.light_on_primary_container,
            android.R.color.system_on_primary_container_light),
        new ColorRole(R.string.light_secondary, android.R.color.system_secondary_light),
        new ColorRole(R.string.light_on_secondary, android.R.color.system_on_secondary_light),
        new ColorRole(R.string.light_secondary_container,
            android.R.color.system_secondary_container_light),
        new ColorRole(R.string.light_on_secondary_container,
            android.R.color.system_on_secondary_container_light),
        new ColorRole(R.string.light_tertiary, android.R.color.system_tertiary_light),
        new ColorRole(R.string.light_on_tertiary, android.R.color.system_on_tertiary_light),
        new ColorRole(R.string.light_tertiary_container,
            android.R.color.system_tertiary_container_light),
        new ColorRole(R.string.light_on_tertiary_container,
            android.R.color.system_on_tertiary_container_light),
        new ColorRole(R.string.light_error, android.R.color.system_error_light),
        new ColorRole(R.string.light_on_error, android.R.color.system_on_error_light),
        new ColorRole(R.string.light_error_container, android.R.color.system_error_container_light),
        new ColorRole(R.string.light_on_error_container,
            android.R.color.system_on_error_container_light),
        new ColorRole(R.string.light_surface, android.R.color.system_surface_light),
        new ColorRole(R.string.light_on_surface, android.R.color.system_on_surface_light),
        new ColorRole(R.string.light_surface_variant, android.R.color.system_surface_variant_light),
        new ColorRole(R.string.light_on_surface_variant,
            android.R.color.system_on_surface_variant_light),
        new ColorRole(R.string.light_surface_container_highest,
            android.R.color.system_surface_container_highest_light),
        new ColorRole(R.string.light_surface_container_high,
            android.R.color.system_surface_container_high_light),
        new ColorRole(R.string.light_surface_container,
            android.R.color.system_surface_container_light),
        new ColorRole(R.string.light_surface_container_low,
            android.R.color.system_surface_container_low_light),
        new ColorRole(R.string.light_surface_container_lowest,
            android.R.color.system_surface_container_lowest_light),
        new ColorRole(R.string.light_outline, android.R.color.system_outline_light),
        new ColorRole(R.string.light_outline_variant, android.R.color.system_outline_variant_light),
        new ColorRole(R.string.light_background, android.R.color.system_background_light),
        new ColorRole(R.string.light_on_background, android.R.color.system_on_background_light),
        new ColorRole(R.string.light_surface_bright, android.R.color.system_surface_bright_light),
        new ColorRole(R.string.light_surface_dim, android.R.color.system_surface_dim_light),
        // Dark colors.
        new ColorRole(R.string.dark_primary, android.R.color.system_primary_dark),
        new ColorRole(R.string.dark_on_primary, android.R.color.system_on_primary_dark),
        new ColorRole(R.string.dark_primary_container,
            android.R.color.system_primary_container_dark),
        new ColorRole(R.string.dark_on_primary_container,
            android.R.color.system_on_primary_container_dark),
        new ColorRole(R.string.dark_secondary, android.R.color.system_secondary_dark),
        new ColorRole(R.string.dark_on_secondary, android.R.color.system_on_secondary_dark),
        new ColorRole(R.string.dark_secondary_container,
            android.R.color.system_secondary_container_dark),
        new ColorRole(R.string.dark_on_secondary_container,
            android.R.color.system_on_secondary_container_dark),
        new ColorRole(R.string.dark_tertiary, android.R.color.system_tertiary_dark),
        new ColorRole(R.string.dark_on_tertiary, android.R.color.system_on_tertiary_dark),
        new ColorRole(R.string.dark_tertiary_container,
            android.R.color.system_tertiary_container_dark),
        new ColorRole(R.string.dark_on_tertiary_container,
            android.R.color.system_on_tertiary_container_dark),
        new ColorRole(R.string.dark_error, android.R.color.system_error_dark),
        new ColorRole(R.string.dark_on_error, android.R.color.system_on_error_dark),
        new ColorRole(R.string.dark_error_container, android.R.color.system_error_container_dark),
        new ColorRole(R.string.dark_on_error_container,
            android.R.color.system_on_error_container_dark),
        new ColorRole(R.string.dark_surface, android.R.color.system_surface_dark),
        new ColorRole(R.string.dark_on_surface, android.R.color.system_on_surface_dark),
        new ColorRole(R.string.dark_surface_variant, android.R.color.system_surface_variant_dark),
        new ColorRole(R.string.dark_on_surface_variant,
            android.R.color.system_on_surface_variant_dark),
        new ColorRole(R.string.dark_surface_container_highest,
            android.R.color.system_surface_container_highest_dark),
        new ColorRole(R.string.dark_surface_container_high,
            android.R.color.system_surface_container_high_dark),
        new ColorRole(R.string.dark_surface_container,
            android.R.color.system_surface_container_dark),
        new ColorRole(R.string.dark_surface_container_low,
            android.R.color.system_surface_container_low_dark),
        new ColorRole(R.string.dark_surface_container_lowest,
            android.R.color.system_surface_container_lowest_dark),
        new ColorRole(R.string.dark_outline, android.R.color.system_outline_dark),
        new ColorRole(R.string.dark_outline_variant, android.R.color.system_outline_variant_dark),
        new ColorRole(R.string.dark_background, android.R.color.system_background_dark),
        new ColorRole(R.string.dark_on_background, android.R.color.system_on_background_dark),
        new ColorRole(R.string.dark_surface_bright, android.R.color.system_surface_bright_dark),
        new ColorRole(R.string.dark_surface_dim, android.R.color.system_surface_dim_dark),
        // Fixed colors.
        new ColorRole(R.string.primary_fixed, android.R.color.system_primary_fixed),
        new ColorRole(R.string.on_primary_fixed, android.R.color.system_on_primary_fixed),
        new ColorRole(R.string.primary_fixed_dim, android.R.color.system_primary_fixed_dim),
        new ColorRole(R.string.on_primary_fixed_variant,
            android.R.color.system_on_primary_fixed_variant),
        new ColorRole(R.string.secondary_fixed, android.R.color.system_secondary_fixed),
        new ColorRole(R.string.on_secondary_fixed, android.R.color.system_on_secondary_fixed),
        new ColorRole(R.string.on_secondary_fixed_variant,
            android.R.color.system_on_secondary_fixed_variant),
        new ColorRole(R.string.secondary_fixed_dim, android.R.color.system_secondary_fixed_dim),
        new ColorRole(R.string.tertiary_fixed, android.R.color.system_tertiary_fixed),
        new ColorRole(R.string.on_tertiary_fixed, android.R.color.system_on_tertiary_fixed),
        new ColorRole(R.string.on_tertiary_fixed_variant,
            android.R.color.system_on_tertiary_fixed_variant),
        new ColorRole(R.string.tertiary_fixed_dim, android.R.color.system_tertiary_fixed_dim)
    );
  }

  private List<ColorRole> getDynamicPalettes() {
    return Arrays.asList(
        // Primary
        new ColorRole(R.string.accent1_1000, android.R.color.system_accent1_1000),
        new ColorRole(R.string.accent1_900, android.R.color.system_accent1_900),
        new ColorRole(R.string.accent1_800, android.R.color.system_accent1_800),
        new ColorRole(R.string.accent1_700, android.R.color.system_accent1_700),
        new ColorRole(R.string.accent1_600, android.R.color.system_accent1_600),
        new ColorRole(R.string.accent1_500, android.R.color.system_accent1_500),
        new ColorRole(R.string.accent1_400, android.R.color.system_accent1_400),
        new ColorRole(R.string.accent1_300, android.R.color.system_accent1_300),
        new ColorRole(R.string.accent1_200, android.R.color.system_accent1_200),
        new ColorRole(R.string.accent1_100, android.R.color.system_accent1_100),
        new ColorRole(R.string.accent1_50, android.R.color.system_accent1_50),
        new ColorRole(R.string.accent1_10, android.R.color.system_accent1_10),
        new ColorRole(R.string.accent1_0, android.R.color.system_accent1_0),
        // Secondary
        new ColorRole(R.string.accent2_1000, android.R.color.system_accent2_1000),
        new ColorRole(R.string.accent2_900, android.R.color.system_accent2_900),
        new ColorRole(R.string.accent2_800, android.R.color.system_accent2_800),
        new ColorRole(R.string.accent2_700, android.R.color.system_accent2_700),
        new ColorRole(R.string.accent2_600, android.R.color.system_accent2_600),
        new ColorRole(R.string.accent2_500, android.R.color.system_accent2_500),
        new ColorRole(R.string.accent2_400, android.R.color.system_accent2_400),
        new ColorRole(R.string.accent2_300, android.R.color.system_accent2_300),
        new ColorRole(R.string.accent2_200, android.R.color.system_accent2_200),
        new ColorRole(R.string.accent2_100, android.R.color.system_accent2_100),
        new ColorRole(R.string.accent2_50, android.R.color.system_accent2_50),
        new ColorRole(R.string.accent2_10, android.R.color.system_accent2_10),
        new ColorRole(R.string.accent2_0, android.R.color.system_accent2_0),
        // Tertiary
        new ColorRole(R.string.accent3_1000, android.R.color.system_accent3_1000),
        new ColorRole(R.string.accent3_900, android.R.color.system_accent3_900),
        new ColorRole(R.string.accent3_800, android.R.color.system_accent3_800),
        new ColorRole(R.string.accent3_700, android.R.color.system_accent3_700),
        new ColorRole(R.string.accent3_600, android.R.color.system_accent3_600),
        new ColorRole(R.string.accent3_500, android.R.color.system_accent3_500),
        new ColorRole(R.string.accent3_400, android.R.color.system_accent3_400),
        new ColorRole(R.string.accent3_300, android.R.color.system_accent3_300),
        new ColorRole(R.string.accent3_200, android.R.color.system_accent3_200),
        new ColorRole(R.string.accent3_100, android.R.color.system_accent3_100),
        new ColorRole(R.string.accent3_50, android.R.color.system_accent3_50),
        new ColorRole(R.string.accent3_10, android.R.color.system_accent3_10),
        new ColorRole(R.string.accent3_0, android.R.color.system_accent3_0),
        // Neutral
        new ColorRole(R.string.neutral1_1000, android.R.color.system_neutral1_1000),
        new ColorRole(R.string.neutral1_900, android.R.color.system_neutral1_900),
        new ColorRole(R.string.neutral1_800, android.R.color.system_neutral1_800),
        new ColorRole(R.string.neutral1_700, android.R.color.system_neutral1_700),
        new ColorRole(R.string.neutral1_600, android.R.color.system_neutral1_600),
        new ColorRole(R.string.neutral1_500, android.R.color.system_neutral1_500),
        new ColorRole(R.string.neutral1_400, android.R.color.system_neutral1_400),
        new ColorRole(R.string.neutral1_300, android.R.color.system_neutral1_300),
        new ColorRole(R.string.neutral1_200, android.R.color.system_neutral1_200),
        new ColorRole(R.string.neutral1_100, android.R.color.system_neutral1_100),
        new ColorRole(R.string.neutral1_50, android.R.color.system_neutral1_50),
        new ColorRole(R.string.neutral1_10, android.R.color.system_neutral1_10),
        new ColorRole(R.string.neutral1_0, android.R.color.system_neutral1_0),
        // Neutral Variant
        new ColorRole(R.string.neutral2_1000, android.R.color.system_neutral2_1000),
        new ColorRole(R.string.neutral2_900, android.R.color.system_neutral2_900),
        new ColorRole(R.string.neutral2_800, android.R.color.system_neutral2_800),
        new ColorRole(R.string.neutral2_700, android.R.color.system_neutral2_700),
        new ColorRole(R.string.neutral2_600, android.R.color.system_neutral2_600),
        new ColorRole(R.string.neutral2_500, android.R.color.system_neutral2_500),
        new ColorRole(R.string.neutral2_400, android.R.color.system_neutral2_400),
        new ColorRole(R.string.neutral2_300, android.R.color.system_neutral2_300),
        new ColorRole(R.string.neutral2_200, android.R.color.system_neutral2_200),
        new ColorRole(R.string.neutral2_100, android.R.color.system_neutral2_100),
        new ColorRole(R.string.neutral2_50, android.R.color.system_neutral2_50),
        new ColorRole(R.string.neutral2_10, android.R.color.system_neutral2_10),
        new ColorRole(R.string.neutral2_0, android.R.color.system_neutral2_0)
    );
  }

}