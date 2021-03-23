// Generated by view binder compiler. Do not edit!
package com.example.trackfit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import com.example.trackfit.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSettingsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnApplyChanges;

  @NonNull
  public final TextInputEditText etName;

  @NonNull
  public final TextInputEditText etWeight;

  @NonNull
  public final Guideline guideline3;

  @NonNull
  public final TextInputLayout tilName;

  @NonNull
  public final TextInputLayout tilWeight;

  private FragmentSettingsBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnApplyChanges, @NonNull TextInputEditText etName,
      @NonNull TextInputEditText etWeight, @NonNull Guideline guideline3,
      @NonNull TextInputLayout tilName, @NonNull TextInputLayout tilWeight) {
    this.rootView = rootView;
    this.btnApplyChanges = btnApplyChanges;
    this.etName = etName;
    this.etWeight = etWeight;
    this.guideline3 = guideline3;
    this.tilName = tilName;
    this.tilWeight = tilWeight;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSettingsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_settings, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSettingsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnApplyChanges;
      Button btnApplyChanges = rootView.findViewById(id);
      if (btnApplyChanges == null) {
        break missingId;
      }

      id = R.id.etName;
      TextInputEditText etName = rootView.findViewById(id);
      if (etName == null) {
        break missingId;
      }

      id = R.id.etWeight;
      TextInputEditText etWeight = rootView.findViewById(id);
      if (etWeight == null) {
        break missingId;
      }

      id = R.id.guideline3;
      Guideline guideline3 = rootView.findViewById(id);
      if (guideline3 == null) {
        break missingId;
      }

      id = R.id.tilName;
      TextInputLayout tilName = rootView.findViewById(id);
      if (tilName == null) {
        break missingId;
      }

      id = R.id.tilWeight;
      TextInputLayout tilWeight = rootView.findViewById(id);
      if (tilWeight == null) {
        break missingId;
      }

      return new FragmentSettingsBinding((ConstraintLayout) rootView, btnApplyChanges, etName,
          etWeight, guideline3, tilName, tilWeight);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}