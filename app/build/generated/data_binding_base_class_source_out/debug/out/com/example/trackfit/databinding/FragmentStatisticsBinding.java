// Generated by view binder compiler. Do not edit!
package com.example.trackfit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.example.trackfit.R;
import com.github.mikephil.charting.charts.LineChart;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentStatisticsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final Guideline guideline2;

  @NonNull
  public final LineChart lineChart;

  @NonNull
  public final MaterialTextView tvAverageSpeed;

  @NonNull
  public final MaterialTextView tvAverageSpeedInfo;

  @NonNull
  public final MaterialTextView tvTotalCalories;

  @NonNull
  public final MaterialTextView tvTotalCaloriesInfo;

  @NonNull
  public final MaterialTextView tvTotalDistance;

  @NonNull
  public final MaterialTextView tvTotalDistanceInfo;

  @NonNull
  public final MaterialTextView tvTotalTime;

  @NonNull
  public final MaterialTextView tvTotalTimeInfo;

  private FragmentStatisticsBinding(@NonNull ConstraintLayout rootView,
      @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull LineChart lineChart,
      @NonNull MaterialTextView tvAverageSpeed, @NonNull MaterialTextView tvAverageSpeedInfo,
      @NonNull MaterialTextView tvTotalCalories, @NonNull MaterialTextView tvTotalCaloriesInfo,
      @NonNull MaterialTextView tvTotalDistance, @NonNull MaterialTextView tvTotalDistanceInfo,
      @NonNull MaterialTextView tvTotalTime, @NonNull MaterialTextView tvTotalTimeInfo) {
    this.rootView = rootView;
    this.guideline = guideline;
    this.guideline2 = guideline2;
    this.lineChart = lineChart;
    this.tvAverageSpeed = tvAverageSpeed;
    this.tvAverageSpeedInfo = tvAverageSpeedInfo;
    this.tvTotalCalories = tvTotalCalories;
    this.tvTotalCaloriesInfo = tvTotalCaloriesInfo;
    this.tvTotalDistance = tvTotalDistance;
    this.tvTotalDistanceInfo = tvTotalDistanceInfo;
    this.tvTotalTime = tvTotalTime;
    this.tvTotalTimeInfo = tvTotalTimeInfo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentStatisticsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentStatisticsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_statistics, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentStatisticsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.guideline;
      Guideline guideline = rootView.findViewById(id);
      if (guideline == null) {
        break missingId;
      }

      id = R.id.guideline2;
      Guideline guideline2 = rootView.findViewById(id);
      if (guideline2 == null) {
        break missingId;
      }

      id = R.id.lineChart;
      LineChart lineChart = rootView.findViewById(id);
      if (lineChart == null) {
        break missingId;
      }

      id = R.id.tvAverageSpeed;
      MaterialTextView tvAverageSpeed = rootView.findViewById(id);
      if (tvAverageSpeed == null) {
        break missingId;
      }

      id = R.id.tvAverageSpeedInfo;
      MaterialTextView tvAverageSpeedInfo = rootView.findViewById(id);
      if (tvAverageSpeedInfo == null) {
        break missingId;
      }

      id = R.id.tvTotalCalories;
      MaterialTextView tvTotalCalories = rootView.findViewById(id);
      if (tvTotalCalories == null) {
        break missingId;
      }

      id = R.id.tvTotalCaloriesInfo;
      MaterialTextView tvTotalCaloriesInfo = rootView.findViewById(id);
      if (tvTotalCaloriesInfo == null) {
        break missingId;
      }

      id = R.id.tvTotalDistance;
      MaterialTextView tvTotalDistance = rootView.findViewById(id);
      if (tvTotalDistance == null) {
        break missingId;
      }

      id = R.id.tvTotalDistanceInfo;
      MaterialTextView tvTotalDistanceInfo = rootView.findViewById(id);
      if (tvTotalDistanceInfo == null) {
        break missingId;
      }

      id = R.id.tvTotalTime;
      MaterialTextView tvTotalTime = rootView.findViewById(id);
      if (tvTotalTime == null) {
        break missingId;
      }

      id = R.id.tvTotalTimeInfo;
      MaterialTextView tvTotalTimeInfo = rootView.findViewById(id);
      if (tvTotalTimeInfo == null) {
        break missingId;
      }

      return new FragmentStatisticsBinding((ConstraintLayout) rootView, guideline, guideline2,
          lineChart, tvAverageSpeed, tvAverageSpeedInfo, tvTotalCalories, tvTotalCaloriesInfo,
          tvTotalDistance, tvTotalDistanceInfo, tvTotalTime, tvTotalTimeInfo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}