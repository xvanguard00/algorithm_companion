// Generated by view binder compiler. Do not edit!
package com.example.licenta_al.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.licenta_al.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityInsertionsortBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextView insertionsortData;

  @NonNull
  public final ScrollView insertionsortID;

  private ActivityInsertionsortBinding(@NonNull ScrollView rootView,
      @NonNull TextView insertionsortData, @NonNull ScrollView insertionsortID) {
    this.rootView = rootView;
    this.insertionsortData = insertionsortData;
    this.insertionsortID = insertionsortID;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityInsertionsortBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityInsertionsortBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_insertionsort, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityInsertionsortBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.insertionsort_data;
      TextView insertionsortData = ViewBindings.findChildViewById(rootView, id);
      if (insertionsortData == null) {
        break missingId;
      }

      ScrollView insertionsortID = (ScrollView) rootView;

      return new ActivityInsertionsortBinding((ScrollView) rootView, insertionsortData,
          insertionsortID);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
