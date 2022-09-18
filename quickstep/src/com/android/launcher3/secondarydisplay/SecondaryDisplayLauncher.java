/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.launcher3.secondarydisplay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewAnimationUtils;
import android.view.inputmethod.InputMethodManager;

import com.android.launcher3.AbstractFloatingView;
import com.android.launcher3.BaseQuickstepLauncher;
import com.android.launcher3.InvariantDeviceProfile;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.R;
import com.android.launcher3.allapps.AllAppsContainerView;
import com.android.launcher3.model.BgDataModel;
import com.android.launcher3.model.data.AppInfo;
import com.android.launcher3.model.data.ItemInfo;
import com.android.launcher3.model.data.ItemInfoWithIcon;
import com.android.launcher3.popup.PopupContainerWithArrow;
import com.android.launcher3.popup.PopupDataProvider;
import com.android.launcher3.util.ComponentKey;
import com.android.launcher3.util.Themes;
import com.android.launcher3.views.BaseDragLayer;

import java.util.HashMap;

/**
 * Launcher activity for secondary displays
 */
public class SecondaryDisplayLauncher extends BaseQuickstepLauncher
        {
}
