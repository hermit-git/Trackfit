// Generated by view binder compiler. Do not edit!
package com.example.trackfit.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.trackfit.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSetupBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final TextInputEditText etName;

  @NonNull
  public final TextInputEditText etWeight;

  @NonNull
  public final TextInputLayout tilName;

  @NonNull
  public final TextInputLayout tilWeight;

  @NonNull
  public final TextView tvContinue;

  @NonNull
  public final TextView tvWeight;

  @NonNull
  public final TextView tvWelcome;

  private FragmentSetupBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout constraintLayout, @NonNull TextInputEditText etName,
      @NonNull TextInputEditText etWeight, @NonNull TextInputLayout tilName,
      @NonNull TextInputLayout tilWeight, @NonNull TextView tvContinue, @NonNull TextView tvWeight,
      @NonNull TextView tvWelcome) {
    this.rootView = rootView;
    this.constraintLayout = constraintLayout;
    this.etName = etName;
    this.etWeight = etWeight;
    this.tilName = tilName;
    this.tilWeight = tilWeight;
    this.tvContinue = tvContinue;
    this.tvWeight = tvWeight;
    this.tvWelcome = tvWelcome;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSetupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSetupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_setup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSetupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.constraintLayout;
      ConstraintLayout constraintLayout = rootView.findViewById(id);
      if (constraintLayout == null) {
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

      id = R.id.tvContinue;
      TextView tvContinue = rootView.findViewById(id);
      if (tvContinue == null) {
        break missingId;
      }

      id = R.id.tvWeight;
      TextView tvWeight = rootView.findViewById(id);
      if (tvWeight == null) {
        break missingId;
      }

      id = R.id.tvWelcome;
      TextView tvWelcome = rootView.findViewById(id);
      if (tvWelcome == null) {
        break missingId;
      }

      return new FragmentSetupBinding((ConstraintLayout) rootView, constraintLayout, etName,
          etWeight, tilName, tilWeight, tvContinue, tvWeight, tvWelcome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
