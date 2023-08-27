package com.daaw.avee.comp.VisualizerCutomization;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Func.Func;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.Vec2f;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.R;
import com.daaw.avee.comp.AlbumArt.InternalBitmapLoader;
import com.daaw.avee.comp.Common.View.SimpleViewProgressBar;
import com.daaw.avee.comp.Common.VisualizerThemeInfo;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Composition;
import com.daaw.avee.comp.Visualizer.Graphic.GraphicsUtils;
import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.OnColorChangedListener;
import com.flask.colorpicker.OnColorSelectedListener;
import com.flask.colorpicker.slider.AlphaSlider;
import com.flask.colorpicker.slider.LightnessSlider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class CustomizeVisView1 {
    private CustomPropertiesList currentElementCustom;
    private CustomizeVisDialog customizeVisDialog;
    private ViewGroup linearLayoutRootContent;
    private Spinner spinnerVersion;
    private AdapterView.OnItemSelectedListener spinnerVersionOnItemClickListener;
    private TextView txtElementTitle;
    private View view1RootView;
    int spinnerVersionInitalSelectedPosition = -1;
    private Map<String, Boolean> propertiesExpandViews = new HashMap();
    private Map<String, Action1<Object>> propertiesUpdateValueCb = new HashMap();

    private static int argb(int i, int i2) {
        return (i << 24) | (i2 & ViewCompat.MEASURED_SIZE_MASK);
    }

    public CustomizeVisView1(CustomizeVisDialog customizeVisDialog) {
        this.customizeVisDialog = customizeVisDialog;
    }

    private static String formatPropertyDisplayName(String str) {
        return formatPropertyDisplayName(str, null);
    }

    private static String formatPropertyDisplayNameWoPrefix(String str, String str2) {
        return formatPropertyDisplayName(Utils.stringSplitInTwoGetSecond(str, 95, str));
    }

    public static String formatPropertyDisplayName(String str, String str2) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        if (str.length() > 0) {
            char upperCase = Character.toUpperCase(str.charAt(0));
            sb.append(upperCase);
            z = Character.isDigit(upperCase);
        } else {
            z = false;
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            boolean z2 = Character.isUpperCase(charAt) || Character.isDigit(charAt);
            if (z && z2) {
                sb.append(' ');
            }
            sb.append(charAt);
            z = !z2;
        }
        if (str2 != null && str2.length() > 0) {
            sb.append(" (");
            sb.append(str2);
            sb.append(')');
        }
        return sb.toString();
    }

    Activity getActivity() {
        return this.customizeVisDialog.getActivity();
    }

    boolean isViewCreated() {
        return this.txtElementTitle != null;
    }

    public void setCollapsed(boolean z) {
        this.view1RootView.setVisibility(z ? 8 : 0);
    }

    public void onCreatedView1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.view1RootView = viewGroup.findViewById(R.id.view1RootView);
        this.linearLayoutRootContent = (ViewGroup) viewGroup.findViewById(R.id.linearLayoutContent);
        this.txtElementTitle = (TextView) viewGroup.findViewById(R.id.txtElementTitle);
        ((ImageButton) viewGroup.findViewById(R.id.btnBack)).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CustomizeVisView1.this.customizeVisDialog.goToView(0);
            }
        });
        ((ImageButton) viewGroup.findViewById(R.id.btnInfo)).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (CustomizeVisView1.this.currentElementCustom != null) {
                    CustomizeVisView1.this.customizeVisDialog.InvokeOnElementWikiInfoAction(CustomizeVisView1.this.currentElementCustom.getTypeName(), CustomizeVisView1.this.currentElementCustom.getVersionId());
                }
            }
        });
        ImageButton imageButton = (ImageButton) viewGroup.findViewById(R.id.btnResetElement);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                EventsGlobalTextNotifier.onTextMsg.invoke(view.getResources().getString(R.string.vis_customization_hold_to_reset_element));
            }
        });
        imageButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.4
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                if (CustomizeVisView1.this.currentElementCustom != null) {
                    CustomizeVisView1.this.customizeVisDialog.InvokeOnActionResetElement(CustomizeVisView1.this.currentElementCustom, null);
                    return true;
                }
                return true;
            }
        });
        this.spinnerVersion = (Spinner) viewGroup.findViewById(R.id.spinnerVersion);
        this.spinnerVersionOnItemClickListener = new AdapterView.OnItemSelectedListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.5
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                CustomizeVisView1.this.customizeVisDialog.ApplySpinnerTheme(adapterView);
                if (CustomizeVisView1.this.currentElementCustom != null) {
                    String customizationName = CustomizeVisView1.this.currentElementCustom.getCustomizationName();
                    String versionId = CustomizeVisView1.this.currentElementCustom.getVersionId();
                    Tuple2<String[], String> InvokeOnRequestElementAvailableVersions = CustomizeVisView1.this.customizeVisDialog.InvokeOnRequestElementAvailableVersions(customizationName, versionId);
                    String[] strArr = InvokeOnRequestElementAvailableVersions.obj1;
                    String str = InvokeOnRequestElementAvailableVersions.obj2;
                    if (i >= 0 && i < strArr.length) {
                        str = strArr[i];
                    }
                    if (VisualizerThemeInfo.CompareElementVersions(versionId, str)) {
                        return;
                    }
                    CustomizeVisView1.this.currentElementCustom.setVersionId(str);
                    CustomizeVisView1.this.customizeVisDialog.onChildPropertyChanged();
                }
            }
        };
        this.propertiesUpdateValueCb.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void parsePropertyData(CustomPropertiesList customPropertiesList) {
        String str;
        if (this.customizeVisDialog.isView1Created() && isViewCreated()) {
            LayoutInflater from = LayoutInflater.from(this.customizeVisDialog.getActivity());
            this.currentElementCustom = customPropertiesList;
            if (customPropertiesList == null) {
                this.txtElementTitle.setText(R.string.nothing_to_show);
                this.linearLayoutRootContent.removeAllViews();
                this.propertiesUpdateValueCb.clear();
                return;
            }
            this.txtElementTitle.setText(customPropertiesList.getCustomizationName());
            this.spinnerVersionInitalSelectedPosition = -2;
            this.spinnerVersion.setOnItemSelectedListener(null);
            CustomPropertiesList customPropertiesList2 = this.currentElementCustom;
            String str2 = "";
            if (customPropertiesList2 != null) {
                str2 = customPropertiesList2.getCustomizationName();
                str = this.currentElementCustom.getVersionId();
            } else {
                str = "";
            }
            Tuple2<String[], String> InvokeOnRequestElementAvailableVersions = this.customizeVisDialog.InvokeOnRequestElementAvailableVersions(str2, str);
            if (InvokeOnRequestElementAvailableVersions.obj1.length > 1) {
                this.spinnerVersion.setVisibility(0);
                int StringToIndex = Utils.StringToIndex(InvokeOnRequestElementAvailableVersions.obj1, str);
                int length = InvokeOnRequestElementAvailableVersions.obj1.length;
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = this.customizeVisDialog.getResources().getString(R.string.vis_customization_ver_x, InvokeOnRequestElementAvailableVersions.obj1[i]);
                }
                this.spinnerVersion.setAdapter((SpinnerAdapter) new ArrayAdapter(this.customizeVisDialog.getActivity(), 17367048, strArr));
                this.spinnerVersionInitalSelectedPosition = StringToIndex;
                if (StringToIndex >= 0) {
                    this.spinnerVersion.setSelection(StringToIndex, false);
                }
                this.customizeVisDialog.ApplySpinnerTheme(this.spinnerVersion);
                this.spinnerVersion.setOnItemSelectedListener(this.spinnerVersionOnItemClickListener);
            } else {
                this.spinnerVersion.setVisibility(4);
            }
            this.linearLayoutRootContent.removeAllViews();
            this.propertiesUpdateValueCb.clear();
            Map<String, MultiList<String, Integer>> GetAllPropertiesGroupedSortedByOrder = customPropertiesList.GetAllPropertiesGroupedSortedByOrder();
            for (final String str3 : GetAllPropertiesGroupedSortedByOrder.keySet()) {
                View inflate = from.inflate(R.layout.dialog_customize_vis_element_group, (ViewGroup) null);
                final ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.linearLayoutContent);
                TextView textView = (TextView) inflate.findViewById(R.id.groupTitle);
                final View findViewById = inflate.findViewById(R.id.btnExpand);
                ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.groupHeader);
                if (parseDataRecursive(this.customizeVisDialog, from, customPropertiesList, viewGroup, GetAllPropertiesGroupedSortedByOrder.get(str3).iterator1()) > 0) {
                    textView.setText(formatPropertyDisplayNameWoPrefix(str3, null));
                    this.linearLayoutRootContent.addView(inflate);
                    viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.6
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            if (viewGroup.getVisibility() == 0) {
                                findViewById.animate().rotation(0.0f);
                                viewGroup.setVisibility(8);
                                CustomizeVisView1.this.propertiesExpandViews.put(str3, false);
                                return;
                            }
                            findViewById.animate().rotation(-90.0f);
                            viewGroup.setVisibility(0);
                            CustomizeVisView1.this.propertiesExpandViews.put(str3, true);
                        }
                    });
                    Boolean bool = this.propertiesExpandViews.get(str3);
                    if (bool != null && !bool.booleanValue()) {
                        findViewById.setRotation(0.0f);
                        viewGroup.setVisibility(8);
                    } else if (bool != null && bool.booleanValue()) {
                        findViewById.setRotation(-90.0f);
                        viewGroup.setVisibility(0);
                    }
                }
            }
        }
    }

    public static boolean createPropertyView(CustomizeVisDialog customizeVisDialog, LayoutInflater layoutInflater, CustomPropertiesList customPropertiesList, ViewGroup viewGroup, String str, boolean z, Func<Action1<Object>> func) {
        String propertyType = customPropertiesList.getPropertyType(str);
        String propertyHint = customPropertiesList.getPropertyHint(str);
        String[] propertyTypeParts = CustomPropertiesList.getPropertyTypeParts(propertyType);
        if (propertyTypeParts[0].equals("i") && propertyTypeParts.length >= 3) {
            createPropertyViewInt(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, formatPropertyDisplayName(str, propertyHint), str, Utils.strToIntSafe(propertyTypeParts[1], 0), Utils.strToIntSafe(propertyTypeParts[2], 100));
        } else if (propertyTypeParts[0].equals("pb")) {
            createPropertyViewBool(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, formatPropertyDisplayName(str, propertyHint), str, true);
        } else if (propertyTypeParts[0].equals("b")) {
            createPropertyViewBool(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, formatPropertyDisplayName(str, propertyHint), str, false);
        } else if (propertyTypeParts[0].equals("crgb")) {
            createPropertyViewRGBA(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, false, false, formatPropertyDisplayName(str, propertyHint), str);
        } else if (propertyTypeParts[0].equals("crgba")) {
            createPropertyViewRGBA(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, true, false, formatPropertyDisplayName(str, propertyHint), str);
        } else if (propertyTypeParts[0].equals("crgb_hl")) {
            createPropertyViewRGBA(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, false, false, formatPropertyDisplayName(str, propertyHint), str);
        } else if (propertyTypeParts[0].equals("chsl4f")) {
            createPropertyViewRGBA(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, false, true, formatPropertyDisplayName(str, propertyHint), str);
        } else if (propertyTypeParts[0].equals("chsla4f")) {
            createPropertyViewRGBA(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, true, true, formatPropertyDisplayName(str, propertyHint), str);
        } else if (propertyTypeParts[0].equals("f") && propertyTypeParts.length >= 3) {
            float strToFloatSafe = Utils.strToFloatSafe(propertyTypeParts[1], 0.0f);
            float strToFloatSafe2 = Utils.strToFloatSafe(propertyTypeParts[2], 100.0f);
            createPropertyViewFloat(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, formatPropertyDisplayName(str, propertyHint), str, strToFloatSafe, strToFloatSafe2, (strToFloatSafe2 - strToFloatSafe) / 40.0f);
        } else if (propertyTypeParts[0].equals("f2") && propertyTypeParts.length >= 3) {
            float strToFloatSafe3 = Utils.strToFloatSafe(propertyTypeParts[1], 0.0f);
            float strToFloatSafe4 = Utils.strToFloatSafe(propertyTypeParts[2], 100.0f);
            createPropertyViewVec2f(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, formatPropertyDisplayName(str, propertyHint), str, strToFloatSafe3, strToFloatSafe4, (strToFloatSafe4 - strToFloatSafe3) / 40.0f);
        } else if (propertyTypeParts[0].equals("mvarf") && propertyTypeParts.length >= 3) {
            float strToFloatSafe5 = Utils.strToFloatSafe(propertyTypeParts[1], 0.0f);
            float strToFloatSafe6 = Utils.strToFloatSafe(propertyTypeParts[2], 100.0f);
            CustomizeVisView1MVar.createPropertyViewMVarFloat(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, false, formatPropertyDisplayName(str, propertyHint), str, strToFloatSafe5, strToFloatSafe6, (strToFloatSafe6 - strToFloatSafe5) / 40.0f);
        } else if (propertyTypeParts[0].equals("mvarf2") && propertyTypeParts.length >= 3) {
            float strToFloatSafe7 = Utils.strToFloatSafe(propertyTypeParts[1], 0.0f);
            float strToFloatSafe8 = Utils.strToFloatSafe(propertyTypeParts[2], 100.0f);
            CustomizeVisView1MVar.createPropertyViewMVarFloat(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, true, formatPropertyDisplayName(str, propertyHint), str, strToFloatSafe7, strToFloatSafe8, (strToFloatSafe8 - strToFloatSafe7) / 40.0f);
        } else if (propertyTypeParts[0].equals("txt")) {
            createPropertyViewText(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, formatPropertyDisplayName(str, propertyHint), str, false);
        } else if (propertyTypeParts[0].equals("ptxt")) {
            createPropertyViewText(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, formatPropertyDisplayName(str, propertyHint), str, true);
        } else if (propertyTypeParts[0].equals("img")) {
            int length = propertyTypeParts.length - 1;
            String[] strArr = new String[length];
            System.arraycopy(propertyTypeParts, 1, strArr, 0, length);
            createPropertyViewImage(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, formatPropertyDisplayName(str, propertyHint), str, strArr, false);
        } else if (propertyTypeParts[0].equals("pimg")) {
            int length2 = propertyTypeParts.length - 1;
            String[] strArr2 = new String[length2];
            System.arraycopy(propertyTypeParts, 1, strArr2, 0, length2);
            createPropertyViewImage(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, formatPropertyDisplayName(str, propertyHint), str, strArr2, true);
        } else if (propertyTypeParts[0].equals("asset")) {
            int length3 = propertyTypeParts.length - 1;
            String[] strArr3 = new String[length3];
            System.arraycopy(propertyTypeParts, 1, strArr3, 0, length3);
            createPropertyViewAsset(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, formatPropertyDisplayName(str, propertyHint), str, strArr3, false);
        } else if (propertyTypeParts[0].equals("passet")) {
            int length4 = propertyTypeParts.length - 1;
            String[] strArr4 = new String[length4];
            System.arraycopy(propertyTypeParts, 1, strArr4, 0, length4);
            createPropertyViewAsset(customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, formatPropertyDisplayName(str, propertyHint), str, strArr4, true);
        } else if (propertyTypeParts[0].equals("sel")) {
            int length5 = propertyTypeParts.length - 1;
            String[] strArr5 = new String[length5];
            System.arraycopy(propertyTypeParts, 1, strArr5, 0, length5);
            createChildView(true, customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, formatPropertyDisplayName(str, propertyHint), str, strArr5);
        } else if (!propertyTypeParts[0].equals("_child")) {
            return false;
        } else {
            int length6 = propertyTypeParts.length - 1;
            String[] strArr6 = new String[length6];
            System.arraycopy(propertyTypeParts, 1, strArr6, 0, length6);
            createChildView(false, customizeVisDialog, layoutInflater, customPropertiesList, z, func, viewGroup, formatPropertyDisplayName(str, propertyHint), str, strArr6);
        }
        return true;
    }

    private static int parseDataRecursive(CustomizeVisDialog customizeVisDialog, LayoutInflater layoutInflater, CustomPropertiesList customPropertiesList, ViewGroup viewGroup, Iterator<String> it) {
        Func<Action1<Object>> func = new Func<Action1<Object>>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Func.Func
            public Action1<Object> onInvoke() {
                return null;
            }
        };
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (!createPropertyView(customizeVisDialog, layoutInflater, customPropertiesList, viewGroup, it.next(), false, func)) {
                i2--;
            }
            i = i2;
        }
        return i;
    }

    private static void createChildView(final boolean z, final CustomizeVisDialog customizeVisDialog, LayoutInflater layoutInflater, final CustomPropertiesList customPropertiesList, boolean z2, final Func<Action1<Object>> func, ViewGroup viewGroup, String str, final String str2, final String[] strArr) {
        View view;
        CustomPropertiesList customPropertiesList2;
        String str3;
        ViewGroup viewGroup2;
        if (z) {
            str3 = customPropertiesList.getPropertySelectString(str2, "");
            customPropertiesList2 = null;
            viewGroup2 = null;
            view = layoutInflater.inflate(R.layout.dialog_customize_vis_element_sel, (ViewGroup) null);
        } else {
            CustomPropertiesList child = customPropertiesList.getChild(str2);
            String typeName = child.getTypeName();
            View inflate = layoutInflater.inflate(R.layout.dialog_customize_vis_element_child, (ViewGroup) null);
            view = inflate;
            customPropertiesList2 = child;
            str3 = typeName;
            viewGroup2 = (ViewGroup) inflate.findViewById(R.id.linearLayoutContent);
        }
        TextView textView = (TextView) view.findViewById(R.id.title);
        textView.setText(str);
        final boolean[] zArr = {false};
        Spinner spinner = (Spinner) view.findViewById(R.id.spinnerType);
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                i = -1;
                break;
            } else if (str3.equals(strArr[i])) {
                break;
            } else {
                i++;
            }
        }
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(customizeVisDialog.getActivity(), 17367048, strArr));
        if (i >= 0) {
            spinner.setSelection(i, false);
        }
        customizeVisDialog.ApplySpinnerTheme(spinner);
        zArr[0] = true;
        ViewGroup viewGroup3 = viewGroup2;
        final CustomPropertiesList customPropertiesList3 = customPropertiesList2;
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.8
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view2, int i2, long j) {
                CustomizeVisDialog.this.ApplySpinnerTheme(adapterView);
                if (!zArr[0] || i2 < 0 || i2 >= strArr.length) {
                    return;
                }
                if (z) {
                    if (customPropertiesList.getPropertySelectString(str2, "").equals(strArr[i2])) {
                        return;
                    }
                    customPropertiesList.putPropertySelectStringValue(str2, strArr[i2]);
                    CustomizeVisDialog.this.onChildPropertyChanged();
                    Action1 action1 = (Action1) func.onInvoke();
                    if (action1 != null) {
                        action1.onInvoke(this);
                    }
                } else if (customPropertiesList3.getTypeName().equals(strArr[i2])) {
                } else {
                    customPropertiesList3.putChildTypeValue(strArr[i2]);
                    CustomizeVisDialog.this.onChildPropertyChanged();
                }
            }
        });
        if (strArr.length > 0) {
            spinner.setVisibility(0);
        } else {
            spinner.setVisibility(8);
            textView.setTextColor(textView.getResources().getColor(R.color.white_alpha_25));
        }
        if (z) {
            viewGroup.addView(view);
            return;
        }
        int parseDataRecursive = parseDataRecursive(customizeVisDialog, layoutInflater, customPropertiesList2, viewGroup3, customPropertiesList2.GetAllPropertiesSortedByOrder());
        if (strArr.length > 0 || parseDataRecursive > 0) {
            viewGroup.addView(view);
        }
        if (parseDataRecursive <= 0) {
            viewGroup3.setVisibility(8);
        }
    }

    private static void createPropertyCommon(CustomizeVisDialog customizeVisDialog, CustomPropertiesList customPropertiesList, boolean z, View view, String str) {
        createPropertyCommon(customizeVisDialog, customPropertiesList, z, view, str, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Action1<Object> createPropertyCommon(final CustomizeVisDialog customizeVisDialog, final CustomPropertiesList customPropertiesList, boolean z, final View view, final String str, final Action1<Object> action1) {
        if (!z) {
            customizeVisDialog.view1AddPropertyUpdateValueCb(customPropertiesList, str, action1);
        }
        if (z) {
            View findViewById = view.findViewById(R.id.elementDetailContent);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            view.findViewById(R.id.elementRoot).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    CustomizeVisDialog.this.onPropertySelected(customPropertiesList, str, view, action1);
                }
            });
        }
        if (action1 != null) {
            action1.onInvoke(null);
        }
        return action1;
    }

    private static void createPropertyViewBool(final CustomizeVisDialog customizeVisDialog, LayoutInflater layoutInflater, final CustomPropertiesList customPropertiesList, boolean z, final Func<Action1<Object>> func, ViewGroup viewGroup, String str, final String str2, boolean z2) {
        View inflate;
        if (z2) {
            inflate = layoutInflater.inflate(z ? R.layout.dialog_customize_vis_elementdetail_toggle_pr : R.layout.dialog_customize_vis_element_toggle_pr, (ViewGroup) null);
        } else {
            inflate = layoutInflater.inflate(z ? R.layout.dialog_customize_vis_elementdetail_toggle : R.layout.dialog_customize_vis_element_toggle, (ViewGroup) null);
        }
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkbox);
        checkBox.setOnCheckedChangeListener(null);
        createPropertyCommon(customizeVisDialog, customPropertiesList, z, inflate, str2, new Action1<Object>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.10
            @Override // com.daaw.avee.Common.Action1
            public void onInvoke(Object obj) {
                checkBox.setChecked(CustomPropertiesList.this.getPropertyBool(str2, false));
            }
        });
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.11
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                CustomPropertiesList.this.putPropertyBoolValue(str2, z3);
                customizeVisDialog.onPropertyChanged();
                Action1 action1 = (Action1) func.onInvoke();
                if (action1 != null) {
                    action1.onInvoke(this);
                }
            }
        });
        viewGroup.addView(inflate);
    }

    private static void createPropertyViewInt(final CustomizeVisDialog customizeVisDialog, LayoutInflater layoutInflater, final CustomPropertiesList customPropertiesList, final boolean z, final Func<Action1<Object>> func, ViewGroup viewGroup, String str, final String str2, final int i, final int i2) {
        customPropertiesList.getPropertyInt(str2, i);
        View inflate = layoutInflater.inflate(z ? R.layout.dialog_customize_vis_elementdetail_bar : R.layout.dialog_customize_vis_element_bar, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        final TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        final View findViewById = inflate.findViewById(R.id.lineBarBg);
        final View findViewById2 = inflate.findViewById(R.id.lineBarValue);
        final SeekBar[] seekBarArr = {null};
        final EditText[] editTextArr = {null};
        if (z) {
            seekBarArr[0] = (SeekBar) inflate.findViewById(R.id.seekBar);
            editTextArr[0] = (EditText) inflate.findViewById(R.id.editTxt);
            seekBarArr[0].setMax(i2 - i);
        }
        final Action1<Object> createPropertyCommon = createPropertyCommon(customizeVisDialog, customPropertiesList, z, inflate, str2, new Action1<Object>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.12
            boolean updating = false;

            @Override // com.daaw.avee.Common.Action1
            public void onInvoke(Object obj) {
                if (this.updating) {
                    return;
                }
                this.updating = true;
                int propertyInt = CustomPropertiesList.this.getPropertyInt(str2, i);
                TextView textView2 = textView;
                textView2.setText("" + propertyInt);
                View view = findViewById;
                View view2 = findViewById2;
                int i3 = i2;
                int i4 = i;
                SimpleViewProgressBar.SetProgress(view, view2, i3 - i4, propertyInt - i4);
                if (z) {
                    if (!seekBarArr[0].equals(obj)) {
                        seekBarArr[0].setProgress(propertyInt - i);
                    }
                    if (!editTextArr[0].equals(obj)) {
                        EditText editText = editTextArr[0];
                        editText.setText("" + propertyInt);
                    }
                }
                this.updating = false;
            }
        });
        if (z) {
            seekBarArr[0].setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.13
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar, int i3, boolean z2) {
                    if (z2) {
                        CustomPropertiesList.this.putPropertyIntValue(str2, i3 + i);
                        customizeVisDialog.onPropertyChanged();
                        createPropertyCommon.onInvoke(seekBarArr[0]);
                        Action1 action1 = (Action1) func.onInvoke();
                        if (action1 != null) {
                            action1.onInvoke(this);
                        }
                    }
                }
            });
            editTextArr[0].addTextChangedListener(new TextWatcher() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.14
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                }

                public int hashCode() {
                    return super.hashCode();
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    customPropertiesList.putPropertyIntValue(str2, Utils.strToIntSafe(editable.toString(), i + (i2 / 2)));
                    customizeVisDialog.onPropertyChanged();
                    createPropertyCommon.onInvoke(editTextArr[0]);
                    Action1 action1 = (Action1) func.onInvoke();
                    if (action1 != null) {
                        action1.onInvoke(null);
                    }
                }
            });
        }
        viewGroup.addView(inflate);
    }

    private static void createPropertyViewRGBA(final CustomizeVisDialog customizeVisDialog, LayoutInflater layoutInflater, final CustomPropertiesList customPropertiesList, final boolean z, final Func<Action1<Object>> func, ViewGroup viewGroup, final boolean z2, final boolean z3, String str, final String str2) {
        Action1<Object> createPropertyCommon;
        View inflate = layoutInflater.inflate(z ? R.layout.dialog_customize_vis_elementdetail_crgba : R.layout.dialog_customize_vis_element_crgba, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        final TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        final View findViewById = inflate.findViewById(R.id.solidValue);
        final ColorPickerView[] colorPickerViewArr = {null};
        LightnessSlider[] lightnessSliderArr = {null};
        final AlphaSlider[] alphaSliderArr = {null};
        if (z) {
            colorPickerViewArr[0] = (ColorPickerView) inflate.findViewById(R.id.colorPicker);
            lightnessSliderArr[0] = (LightnessSlider) inflate.findViewById(R.id.lightnessSlider);
            alphaSliderArr[0] = (AlphaSlider) inflate.findViewById(R.id.alphaSlider);
            colorPickerViewArr[0].setLightnessSlider(lightnessSliderArr[0]);
            colorPickerViewArr[0].setAlphaSlider(alphaSliderArr[0]);
        }
        if (z3) {
            createPropertyCommon = createPropertyCommon(customizeVisDialog, customPropertiesList, z, inflate, str2, new Action1() { // from class: com.daaw.avee.comp.VisualizerCutomization.-$$Lambda$CustomizeVisView1$FPVCpI2iNg6iPDgStNjZOA5tb2o
                @Override // com.daaw.avee.Common.Action1
                public final void onInvoke(Object obj) {
                    CustomizeVisView1.lambda$createPropertyViewRGBA$0(CustomPropertiesList.this, str2, z, z2, alphaSliderArr, colorPickerViewArr, textView, findViewById, obj);
                }
            });
        } else {
            createPropertyCommon = createPropertyCommon(customizeVisDialog, customPropertiesList, z, inflate, str2, new Action1() { // from class: com.daaw.avee.comp.VisualizerCutomization.-$$Lambda$CustomizeVisView1$G4GpdLU9_FNgghx5rUnQgJzFpis
                @Override // com.daaw.avee.Common.Action1
                public final void onInvoke(Object obj) {
                    CustomizeVisView1.lambda$createPropertyViewRGBA$1(CustomPropertiesList.this, str2, z, z2, alphaSliderArr, colorPickerViewArr, textView, findViewById, obj);
                }
            });
        }
        if (z) {
            ColorPickerView colorPickerView = colorPickerViewArr[0];
            final Action1<Object> action1 = createPropertyCommon;
            colorPickerView.addOnColorChangedListener(new OnColorChangedListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.-$$Lambda$CustomizeVisView1$1oA8zyRYUuxVJVL5cw4oD2Zk9_I
                @Override // com.flask.colorpicker.OnColorChangedListener
                public final void onColorChanged(int i) {
                    CustomizeVisView1.lambda$createPropertyViewRGBA$2(z3, customPropertiesList, str2, customizeVisDialog, action1, colorPickerViewArr, func, i);
                }
            });
            colorPickerViewArr[0].addOnColorSelectedListener(new OnColorSelectedListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.-$$Lambda$CustomizeVisView1$Hogu75pJii5wXCOYYyLdh3Xdhdg
                @Override // com.flask.colorpicker.OnColorSelectedListener
                public final void onColorSelected(int i) {
                    CustomizeVisView1.lambda$createPropertyViewRGBA$3(z3, customPropertiesList, str2, customizeVisDialog, action1, colorPickerViewArr, func, i);
                }
            });
        }
        viewGroup.addView(inflate);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$createPropertyViewRGBA$0(CustomPropertiesList customPropertiesList, String str, boolean z, boolean z2, AlphaSlider[] alphaSliderArr, ColorPickerView[] colorPickerViewArr, TextView textView, View view, Object obj) {
        int hlsa1ColorToInt = GraphicsUtils.hlsa1ColorToInt(customPropertiesList.getPropertyArray4f(str, new float[]{1.0f, 1.0f, 1.0f, 1.0f}));
        if (z) {
            if (z2) {
                alphaSliderArr[0].setVisibility(0);
            } else {
                alphaSliderArr[0].setVisibility(8);
            }
            if (!colorPickerViewArr[0].equals(obj)) {
                colorPickerViewArr[0].setColor(hlsa1ColorToInt, true);
            }
        }
        textView.setText(Utils.intToHexString(hlsa1ColorToInt));
        view.setBackgroundColor(hlsa1ColorToInt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$createPropertyViewRGBA$1(CustomPropertiesList customPropertiesList, String str, boolean z, boolean z2, AlphaSlider[] alphaSliderArr, ColorPickerView[] colorPickerViewArr, TextView textView, View view, Object obj) {
        int propertyInt = customPropertiesList.getPropertyInt(str, -1);
        if (z) {
            if (z2) {
                alphaSliderArr[0].setVisibility(0);
            } else {
                alphaSliderArr[0].setVisibility(8);
            }
            if (!colorPickerViewArr[0].equals(obj)) {
                colorPickerViewArr[0].setColor(propertyInt, true);
            }
        }
        textView.setText(Utils.intToHexString(propertyInt));
        view.setBackgroundColor(propertyInt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$createPropertyViewRGBA$2(boolean z, CustomPropertiesList customPropertiesList, String str, CustomizeVisDialog customizeVisDialog, Action1 action1, ColorPickerView[] colorPickerViewArr, Func func, int i) {
        if (z) {
            float[] fArr = new float[4];
            GraphicsUtils.intColorToHlsa1(fArr, i);
            customPropertiesList.putPropertyArray4fValue(str, fArr);
        } else {
            customPropertiesList.putPropertyIntValue(str, i);
        }
        customizeVisDialog.onPropertyChanged();
        action1.onInvoke(colorPickerViewArr[0]);
        Action1 action12 = (Action1) func.onInvoke();
        if (action12 != null) {
            action12.onInvoke(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$createPropertyViewRGBA$3(boolean z, CustomPropertiesList customPropertiesList, String str, CustomizeVisDialog customizeVisDialog, Action1 action1, ColorPickerView[] colorPickerViewArr, Func func, int i) {
        if (z) {
            float[] fArr = new float[4];
            GraphicsUtils.intColorToHlsa1(fArr, i);
            customPropertiesList.putPropertyArray4fValue(str, fArr);
        } else {
            customPropertiesList.putPropertyIntValue(str, i);
        }
        customizeVisDialog.onPropertyChanged();
        action1.onInvoke(colorPickerViewArr[0]);
        Action1 action12 = (Action1) func.onInvoke();
        if (action12 != null) {
            action12.onInvoke(null);
        }
    }

    private static void createPropertyViewFloat(final CustomizeVisDialog customizeVisDialog, LayoutInflater layoutInflater, final CustomPropertiesList customPropertiesList, final boolean z, final Func<Action1<Object>> func, ViewGroup viewGroup, String str, final String str2, final float f, final float f2, final float f3) {
        View inflate = layoutInflater.inflate(z ? R.layout.dialog_customize_vis_elementdetail_bar : R.layout.dialog_customize_vis_element_bar, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        final TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        final View findViewById = inflate.findViewById(R.id.lineBarBg);
        final View findViewById2 = inflate.findViewById(R.id.lineBarValue);
        final SeekBar[] seekBarArr = {null};
        final EditText[] editTextArr = {null};
        if (z) {
            seekBarArr[0] = (SeekBar) inflate.findViewById(R.id.seekBar);
            editTextArr[0] = (EditText) inflate.findViewById(R.id.editTxt);
            seekBarArr[0].setMax((int) ((f2 - f) / f3));
        }
        final Action1<Object> createPropertyCommon = createPropertyCommon(customizeVisDialog, customPropertiesList, z, inflate, str2, new Action1<Object>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.15
            boolean updating = false;

            @Override // com.daaw.avee.Common.Action1
            public void onInvoke(Object obj) {
                if (this.updating) {
                    return;
                }
                this.updating = true;
                float propertyFloat = CustomPropertiesList.this.getPropertyFloat(str2, f);
                textView.setText(String.format(Locale.US, "%.3f", Float.valueOf(propertyFloat)));
                View view = findViewById;
                View view2 = findViewById2;
                float f4 = f2;
                float f5 = f;
                float f6 = f3;
                SimpleViewProgressBar.SetProgress(view, view2, (f4 - f5) / f6, (propertyFloat - f5) / f6);
                if (z) {
                    if (!seekBarArr[0].equals(obj)) {
                        seekBarArr[0].setProgress((int) ((propertyFloat - f) / f3));
                    }
                    if (!editTextArr[0].equals(obj)) {
                        editTextArr[0].setText(String.format(Locale.US, "%.3f", Float.valueOf(propertyFloat)));
                    }
                }
                this.updating = false;
            }
        });
        if (z) {
            seekBarArr[0].setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.16
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar, int i, boolean z2) {
                    if (z2) {
                        customPropertiesList.putPropertyFloatValue(str2, (i * f3) + f);
                        customizeVisDialog.onPropertyChanged();
                        createPropertyCommon.onInvoke(seekBarArr[0]);
                        Action1 action1 = (Action1) func.onInvoke();
                        if (action1 != null) {
                            action1.onInvoke(null);
                        }
                    }
                }
            });
            editTextArr[0].addTextChangedListener(new TextWatcher() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.17
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public int hashCode() {
                    return super.hashCode();
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    customPropertiesList.putPropertyFloatValue(str2, Utils.strToFloatSafe(editable.toString(), f + (f2 * 0.5f)));
                    customizeVisDialog.onPropertyChanged();
                    createPropertyCommon.onInvoke(editTextArr[0]);
                    Action1 action1 = (Action1) func.onInvoke();
                    if (action1 != null) {
                        action1.onInvoke(null);
                    }
                }
            });
        }
        viewGroup.addView(inflate);
    }

    private static void createPropertyViewVec2f(final CustomizeVisDialog customizeVisDialog, LayoutInflater layoutInflater, final CustomPropertiesList customPropertiesList, final boolean z, final Func<Action1<Object>> func, ViewGroup viewGroup, String str, final String str2, final float f, final float f2, final float f3) {
        customPropertiesList.getPropertyVec2f(str2, new Vec2f(f, f));
        View inflate = layoutInflater.inflate(z ? R.layout.dialog_customize_vis_elementdetail_bar_xy : R.layout.dialog_customize_vis_element_bar_xy, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        final TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        final View findViewById = inflate.findViewById(R.id.lineBarBgX);
        final View findViewById2 = inflate.findViewById(R.id.lineBarValueX);
        final View findViewById3 = inflate.findViewById(R.id.lineBarBgY);
        final View findViewById4 = inflate.findViewById(R.id.lineBarValueY);
        final SeekBar[] seekBarArr = {null};
        final SeekBar[] seekBarArr2 = {null};
        final EditText[] editTextArr = {null};
        final EditText[] editTextArr2 = {null};
        if (z) {
            seekBarArr[0] = (SeekBar) inflate.findViewById(R.id.seekBarX);
            seekBarArr2[0] = (SeekBar) inflate.findViewById(R.id.seekBarY);
            editTextArr[0] = (EditText) inflate.findViewById(R.id.editTxtX);
            editTextArr2[0] = (EditText) inflate.findViewById(R.id.editTxtY);
            int i = (int) ((f2 - f) / f3);
            seekBarArr[0].setMax(i);
            seekBarArr2[0].setMax(i);
        }
        final Action1<Object> createPropertyCommon = createPropertyCommon(customizeVisDialog, customPropertiesList, z, inflate, str2, new Action1<Object>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.18
            boolean updating = false;

            @Override // com.daaw.avee.Common.Action1
            public void onInvoke(Object obj) {
                if (this.updating) {
                    return;
                }
                this.updating = true;
                CustomPropertiesList customPropertiesList2 = CustomPropertiesList.this;
                String str3 = str2;
                float f4 = f;
                Vec2f propertyVec2f = customPropertiesList2.getPropertyVec2f(str3, new Vec2f(f4, f4));
                textView.setText(String.format(Locale.US, "%.3f   %.3f", Float.valueOf(propertyVec2f.x), Float.valueOf(propertyVec2f.y)));
                SimpleViewProgressBar.SetProgress(findViewById, findViewById2, (f2 - f) / f3, (propertyVec2f.x - f) / f3);
                SimpleViewProgressBar.SetProgress(findViewById3, findViewById4, (f2 - f) / f3, (propertyVec2f.y - f) / f3);
                if (z) {
                    if (!seekBarArr[0].equals(obj)) {
                        seekBarArr[0].setProgress((int) ((propertyVec2f.x - f) / f3));
                    }
                    if (!seekBarArr2[0].equals(obj)) {
                        seekBarArr2[0].setProgress((int) ((propertyVec2f.y - f) / f3));
                    }
                    if (!editTextArr[0].equals(obj)) {
                        editTextArr[0].setText(String.format(Locale.US, "%.3f", Float.valueOf(propertyVec2f.x)));
                    }
                    if (!editTextArr2[0].equals(obj)) {
                        editTextArr2[0].setText(String.format(Locale.US, "%.3f", Float.valueOf(propertyVec2f.y)));
                    }
                }
                this.updating = false;
            }
        });
        if (z) {
            seekBarArr[0].setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.19
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
                    if (z2) {
                        CustomPropertiesList customPropertiesList2 = CustomPropertiesList.this;
                        String str3 = str2;
                        float f4 = f;
                        CustomPropertiesList.this.putPropertyVec2fValue(str2, new Vec2f((i2 * f3) + f, customPropertiesList2.getPropertyVec2f(str3, new Vec2f(f4, f4)).y));
                        customizeVisDialog.onPropertyChanged();
                        createPropertyCommon.onInvoke(seekBarArr[0]);
                        Action1 action1 = (Action1) func.onInvoke();
                        if (action1 != null) {
                            action1.onInvoke(null);
                        }
                    }
                }
            });
            seekBarArr2[0].setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.20
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onStopTrackingTouch(SeekBar seekBar) {
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public void onProgressChanged(SeekBar seekBar, int i2, boolean z2) {
                    if (z2) {
                        CustomPropertiesList customPropertiesList2 = CustomPropertiesList.this;
                        String str3 = str2;
                        float f4 = f;
                        CustomPropertiesList.this.putPropertyVec2fValue(str2, new Vec2f(customPropertiesList2.getPropertyVec2f(str3, new Vec2f(f4, f4)).x, (i2 * f3) + f));
                        customizeVisDialog.onPropertyChanged();
                        createPropertyCommon.onInvoke(seekBarArr2[0]);
                        Action1 action1 = (Action1) func.onInvoke();
                        if (action1 != null) {
                            action1.onInvoke(null);
                        }
                    }
                }
            });
            editTextArr[0].addTextChangedListener(new TextWatcher() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.21
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                public int hashCode() {
                    return super.hashCode();
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    float strToFloatSafe = Utils.strToFloatSafe(editable.toString(), f + (f2 * 0.5f));
                    CustomPropertiesList customPropertiesList2 = customPropertiesList;
                    String str3 = str2;
                    float f4 = f;
                    customPropertiesList.putPropertyVec2fValue(str2, new Vec2f(strToFloatSafe, customPropertiesList2.getPropertyVec2f(str3, new Vec2f(f4, f4)).y));
                    customizeVisDialog.onPropertyChanged();
                    createPropertyCommon.onInvoke(editTextArr[0]);
                    Action1 action1 = (Action1) func.onInvoke();
                    if (action1 != null) {
                        action1.onInvoke(null);
                    }
                }
            });
            editTextArr2[0].addTextChangedListener(new TextWatcher() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.22
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                public int hashCode() {
                    return super.hashCode();
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    float strToFloatSafe = Utils.strToFloatSafe(editable.toString(), f + (f2 * 0.5f));
                    CustomPropertiesList customPropertiesList2 = customPropertiesList;
                    String str3 = str2;
                    float f4 = f;
                    customPropertiesList.putPropertyVec2fValue(str2, new Vec2f(customPropertiesList2.getPropertyVec2f(str3, new Vec2f(f4, f4)).x, strToFloatSafe));
                    customizeVisDialog.onPropertyChanged();
                    createPropertyCommon.onInvoke(editTextArr2[0]);
                    Action1 action1 = (Action1) func.onInvoke();
                    if (action1 != null) {
                        action1.onInvoke(null);
                    }
                }
            });
        }
        viewGroup.addView(inflate);
    }

    private static void createPropertyViewText(final CustomizeVisDialog customizeVisDialog, LayoutInflater layoutInflater, final CustomPropertiesList customPropertiesList, boolean z, final Func<Action1<Object>> func, ViewGroup viewGroup, String str, final String str2, boolean z2) {
        View inflate;
        String propertyString = customPropertiesList.getPropertyString(str2, "");
        if (z2) {
            inflate = layoutInflater.inflate(z ? R.layout.dialog_customize_vis_elementdetail_txt_pr : R.layout.dialog_customize_vis_element_txt_pr, (ViewGroup) null);
        } else {
            inflate = layoutInflater.inflate(z ? R.layout.dialog_customize_vis_elementdetail_txt : R.layout.dialog_customize_vis_element_txt, (ViewGroup) null);
        }
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        final TextView textView = (TextView) inflate.findViewById(R.id.txtValue);
        createPropertyCommon(customizeVisDialog, customPropertiesList, z, inflate, str2, new Action1<Object>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.23
            @Override // com.daaw.avee.Common.Action1
            public void onInvoke(Object obj) {
                textView.setText(CustomPropertiesList.this.getPropertyString(str2, ""));
            }
        });
        if (z) {
            EditText editText = (EditText) inflate.findViewById(R.id.editTxt);
            editText.setText(propertyString);
            editText.addTextChangedListener(new TextWatcher() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.24
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public int hashCode() {
                    return super.hashCode();
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    String obj = editable.toString();
                    textView.setText(obj);
                    customPropertiesList.putPropertyStringValue(str2, obj);
                    customizeVisDialog.onPropertyChanged();
                    Action1 action1 = (Action1) func.onInvoke();
                    if (action1 != null) {
                        action1.onInvoke(this);
                    }
                }
            });
        }
        viewGroup.addView(inflate);
    }

    private static void createPropertyViewImage(final CustomizeVisDialog customizeVisDialog, LayoutInflater layoutInflater, final CustomPropertiesList customPropertiesList, final boolean z, final Func<Action1<Object>> func, ViewGroup viewGroup, String str, final String str2, String[] strArr, boolean z2) {
        View inflate;
        ViewGroup viewGroup2;
        View view;
        int i;
        int i2;
        Button button;
        Button button2;
        LinearLayout linearLayout;
        View view2;
        ViewGroup viewGroup3;
        String[] strArr2 = strArr;
        int entryCount = customizeVisDialog.customizationScene != null ? customizeVisDialog.customizationScene.getEntryCount() : 0;
        final String propertyString = customPropertiesList.getPropertyString(str2, "");
        ViewGroup viewGroup4 = null;
        if (z2) {
            inflate = layoutInflater.inflate(z ? R.layout.dialog_customize_vis_elementdetail_image_pr : R.layout.dialog_customize_vis_element_image_pr, (ViewGroup) null);
        } else {
            inflate = layoutInflater.inflate(z ? R.layout.dialog_customize_vis_elementdetail_image : R.layout.dialog_customize_vis_element_image, (ViewGroup) null);
        }
        View view3 = inflate;
        ((TextView) view3.findViewById(R.id.title)).setText(str);
        View findViewById = view3.findViewById(R.id.elemValue);
        final ImageButton imageButton = (ImageButton) findViewById.findViewById(R.id.btn0);
        final TextView textView = (TextView) findViewById.findViewById(R.id.txt0);
        imageButton.setClickable(false);
        final EditText[] editTextArr = {null};
        if (z) {
            editTextArr[0] = (EditText) view3.findViewById(R.id.editTxt);
        }
        int i3 = R.id.btn0;
        final Action1<Object> createPropertyCommon = createPropertyCommon(customizeVisDialog, customPropertiesList, z, view3, str2, new Action1<Object>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.25
            @Override // com.daaw.avee.Common.Action1
            public void onInvoke(Object obj) {
                String propertyString2 = CustomPropertiesList.this.getPropertyString(str2, "");
                int resIdFromPath = InternalBitmapLoader.getResIdFromPath(propertyString2);
                if (resIdFromPath <= 0) {
                    int indexFromStringPath = Composition.getIndexFromStringPath(propertyString2);
                    if (indexFromStringPath >= 0) {
                        textView.setVisibility(0);
                        TextView textView2 = textView;
                        textView2.setText("" + indexFromStringPath);
                        imageButton.setImageResource(R.drawable.ic_visual1);
                    } else if (propertyString2 == null || propertyString2.length() <= 0) {
                        textView.setVisibility(8);
                        imageButton.setImageResource(0);
                    } else {
                        textView.setVisibility(8);
                        imageButton.setImageResource(R.drawable.ic_visual3);
                    }
                } else {
                    textView.setVisibility(8);
                    imageButton.setImageResource(resIdFromPath);
                }
                if (!z || editTextArr[0].equals(obj)) {
                    return;
                }
                editTextArr[0].setText(propertyString2);
            }
        });
        if (z) {
            View view4 = view3;
            LinearLayout linearLayout2 = (LinearLayout) view4.findViewById(R.id.layoutContent);
            Button button3 = (Button) view4.findViewById(R.id.btnValue);
            Button button4 = (Button) view4.findViewById(R.id.btnResetValue);
            int i4 = 0;
            boolean z3 = false;
            while (true) {
                int length = strArr2.length;
                i = R.layout.dialog_customize_vis_element_asset_elem;
                if (i4 >= length) {
                    break;
                }
                final String str3 = strArr2[i4];
                int resIdFromPath = InternalBitmapLoader.getResIdFromPath(str3);
                if (resIdFromPath <= 0) {
                    int indexFromStringPath = Composition.getIndexFromStringPath(str3);
                    i2 = i4;
                    button = button4;
                    button2 = button3;
                    linearLayout = linearLayout2;
                    view2 = view4;
                    viewGroup3 = viewGroup4;
                    if (indexFromStringPath >= 0) {
                        z3 = true;
                    }
                } else {
                    View inflate2 = layoutInflater.inflate(R.layout.dialog_customize_vis_element_asset_elem, viewGroup4);
                    final ImageButton imageButton2 = (ImageButton) inflate2.findViewById(i3);
                    imageButton2.setImageResource(resIdFromPath);
                    i2 = i4;
                    button = button4;
                    button2 = button3;
                    linearLayout = linearLayout2;
                    view2 = view4;
                    viewGroup3 = viewGroup4;
                    imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.26
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view5) {
                            CustomPropertiesList.this.putPropertyStringValue(str2, str3);
                            customizeVisDialog.onPropertyChanged();
                            createPropertyCommon.onInvoke(imageButton2);
                            Action1 action1 = (Action1) func.onInvoke();
                            if (action1 != null) {
                                action1.onInvoke(this);
                            }
                        }
                    });
                    linearLayout.addView(inflate2);
                }
                i4 = i2 + 1;
                button4 = button;
                button3 = button2;
                linearLayout2 = linearLayout;
                viewGroup4 = viewGroup3;
                view4 = view2;
                i3 = R.id.btn0;
                strArr2 = strArr;
            }
            final Button button5 = button4;
            Button button6 = button3;
            LinearLayout linearLayout3 = linearLayout2;
            View view5 = view4;
            ViewGroup viewGroup5 = viewGroup4;
            if (z3) {
                int i5 = 1;
                while (i5 < entryCount) {
                    final String makeIndexStringPath = Composition.makeIndexStringPath(i5);
                    View inflate3 = layoutInflater.inflate(i, viewGroup5);
                    TextView textView2 = (TextView) inflate3.findViewById(R.id.txt0);
                    textView2.setVisibility(0);
                    textView2.setText("" + i5);
                    final ImageButton imageButton3 = (ImageButton) inflate3.findViewById(R.id.btn0);
                    imageButton3.setImageResource(R.drawable.ic_visual1);
                    imageButton3.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.27
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view6) {
                            CustomPropertiesList.this.putPropertyStringValue(str2, makeIndexStringPath);
                            customizeVisDialog.onPropertyChanged();
                            createPropertyCommon.onInvoke(imageButton3);
                            Action1 action1 = (Action1) func.onInvoke();
                            if (action1 != null) {
                                action1.onInvoke(this);
                            }
                        }
                    });
                    linearLayout3.addView(inflate3);
                    i5++;
                    i = R.layout.dialog_customize_vis_element_asset_elem;
                    viewGroup5 = null;
                }
            }
            button6.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.28
                @Override // android.view.View.OnClickListener
                public void onClick(View view6) {
                    CustomizeVisDialog.onImagePropertyPicking.invoke(CustomizeVisDialog.this, r2, customPropertiesList.getHierarchyPath(), str2, propertyString);
                }
            });
            button5.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.29
                @Override // android.view.View.OnClickListener
                public void onClick(View view6) {
                    TextView textView3 = r1;
                    if (textView3 != null) {
                        textView3.setText("");
                    }
                    customPropertiesList.putPropertyStringValue(str2, "");
                    customizeVisDialog.onPropertyChanged();
                    createPropertyCommon.onInvoke(button5);
                    Action1 action1 = (Action1) func.onInvoke();
                    if (action1 != null) {
                        action1.onInvoke(this);
                    }
                }
            });
            editTextArr[0].addTextChangedListener(new TextWatcher() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.30
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                }

                public int hashCode() {
                    return super.hashCode();
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    CustomPropertiesList.this.putPropertyStringValue(str2, editable.toString());
                    customizeVisDialog.onPropertyChanged();
                    createPropertyCommon.onInvoke(editTextArr[0]);
                    Action1 action1 = (Action1) func.onInvoke();
                    if (action1 != null) {
                        action1.onInvoke(null);
                    }
                }
            });
            viewGroup2 = viewGroup;
            view = view5;
        } else {
            viewGroup2 = viewGroup;
            view = view3;
        }
        viewGroup2.addView(view);
    }

    private static void createPropertyViewAsset(final CustomizeVisDialog customizeVisDialog, LayoutInflater layoutInflater, final CustomPropertiesList customPropertiesList, boolean z, final Func<Action1<Object>> func, ViewGroup viewGroup, String str, final String str2, final String[] strArr, boolean z2) {
        View inflate;
        View view;
        View inflate2;
        LayoutInflater layoutInflater2 = layoutInflater;
        customPropertiesList.getPropertyString(str2, "");
        ViewGroup viewGroup2 = null;
        if (z2) {
            inflate = layoutInflater2.inflate(z ? R.layout.dialog_customize_vis_elementdetail_image_pr : R.layout.dialog_customize_vis_element_image_pr, (ViewGroup) null);
        } else {
            inflate = layoutInflater2.inflate(z ? R.layout.dialog_customize_vis_elementdetail_image : R.layout.dialog_customize_vis_element_image, (ViewGroup) null);
        }
        View view2 = inflate;
        ((TextView) view2.findViewById(R.id.title)).setText(str);
        View findViewById = view2.findViewById(R.id.elemValue);
        int i = R.id.btn0;
        final ImageButton imageButton = (ImageButton) findViewById.findViewById(R.id.btn0);
        final TextView textView = (TextView) findViewById.findViewById(R.id.txt0);
        int i2 = 0;
        imageButton.setClickable(false);
        createPropertyCommon(customizeVisDialog, customPropertiesList, z, view2, str2, new Action1<Object>() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.31
            @Override // com.daaw.avee.Common.Action1
            public void onInvoke(Object obj) {
                int i3;
                String propertyString = CustomPropertiesList.this.getPropertyString(str2, "");
                int i4 = 0;
                while (true) {
                    String[] strArr2 = strArr;
                    if (i4 >= strArr2.length) {
                        i3 = -1;
                        break;
                    }
                    String[] strArr3 = new String[2];
                    Utils.stringSplitInTwo(strArr2[i4], 58, strArr3);
                    if (propertyString.equals(strArr3[0])) {
                        i3 = Utils.strToIntSafe(strArr3[1], 0);
                        break;
                    }
                    i4++;
                }
                if (i3 <= 0) {
                    textView.setVisibility(8);
                    imageButton.setImageResource(0);
                    return;
                }
                textView.setVisibility(8);
                imageButton.setImageResource(i3);
            }
        });
        if (z) {
            LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.layoutContent);
            Button button = (Button) view2.findViewById(R.id.btnResetValue);
            ((Button) view2.findViewById(R.id.btnValue)).setVisibility(8);
            int i3 = 0;
            while (i3 < strArr.length) {
                final String[] strArr2 = new String[2];
                Utils.stringSplitInTwo(strArr[i3], 58, strArr2);
                final int strToIntSafe = Utils.strToIntSafe(strArr2[1], i2);
                if (z2) {
                    inflate2 = layoutInflater2.inflate(R.layout.dialog_customize_vis_element_asset_pr_elem, viewGroup2);
                } else {
                    inflate2 = layoutInflater2.inflate(R.layout.dialog_customize_vis_element_asset_elem, viewGroup2);
                }
                ImageButton imageButton2 = (ImageButton) inflate2.findViewById(i);
                imageButton2.setImageResource(strToIntSafe);
                final ImageButton imageButton3 = imageButton;
                imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.32
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view3) {
                        CustomPropertiesList.this.putPropertyStringValue(str2, strArr2[0]);
                        customizeVisDialog.onPropertyChanged();
                        imageButton3.setImageResource(strToIntSafe);
                        textView.setVisibility(8);
                        Action1 action1 = (Action1) func.onInvoke();
                        if (action1 != null) {
                            action1.onInvoke(this);
                        }
                    }
                });
                linearLayout.addView(inflate2);
                i3++;
                layoutInflater2 = layoutInflater;
                button = button;
                view2 = view2;
                imageButton = imageButton3;
                viewGroup2 = viewGroup2;
                i2 = 0;
                i = R.id.btn0;
            }
            final ImageButton imageButton4 = imageButton;
            view = view2;
            button.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualizerCutomization.CustomizeVisView1.33
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    TextView textView2 = r1;
                    if (textView2 != null) {
                        textView2.setText("");
                    }
                    customPropertiesList.putPropertyStringValue(str2, "");
                    customizeVisDialog.onPropertyChanged();
                    imageButton4.setImageResource(0);
                    textView.setVisibility(8);
                    Action1 action1 = (Action1) func.onInvoke();
                    if (action1 != null) {
                        action1.onInvoke(this);
                    }
                }
            });
        } else {
            view = view2;
        }
        viewGroup.addView(view);
    }

    public void onImagePropertyValuePicked(TextView textView, List<String> list, String str, String str2) {
        Iterator<String> it;
        tlog.d("hierarchyPath" + list + " propertyName: " + str + " value: " + str2);
        String str3 = "";
        if (this.linearLayoutRootContent != null && textView != null) {
            textView.setText(str2 != null ? str2 : "");
        }
        if (list == null || str == null) {
            return;
        }
        CustomPropertiesList data = this.customizeVisDialog.customizationScene.getData(list);
        if (data != null) {
            if (str2 == null) {
                str2 = "";
            }
            data.putPropertyStringValue(str, str2);
            this.customizeVisDialog.onFinishedChangingProperties();
            return;
        }
        while (list.iterator().hasNext()) {
            str3 = str3 + it.next();
        }
        tlog.w("invalid hierarchyPath: [" + str3 + "]");
    }

    public void AddPropertyUpdateValueCb(CustomPropertiesList customPropertiesList, String str, Action1<Object> action1) {
        this.propertiesUpdateValueCb.put(CustomPropertiesList.MakeHierarchyPathKeyString(customPropertiesList.getHierarchyPath(), str), action1);
    }

    public Action1<Object> GetPropertyUpdateValueCb(List<String> list, String str) {
        if (list == null || str == null) {
            return null;
        }
        return this.propertiesUpdateValueCb.get(CustomPropertiesList.MakeHierarchyPathKeyString(list, str));
    }
}
