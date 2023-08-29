package com.daaw.avee.Design;

import android.app.Activity;
import android.app.DialogFragment;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import androidx.core.app.NotificationCompat;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.UtilsFileSys;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.R;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.VisualizerThemeInfo;
import com.daaw.avee.comp.VisualUI.VisualizerChooseDialog;
import com.daaw.avee.comp.Visualizer.CustomScene;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
/* loaded from: classes.dex */
public class VisualizerSharingDesign extends DesignBase {
    public static final String PackedContent_SceneFileName = "scene.json";
    public static final String StringContent_FileExtWithDotAlt = ".json";
    WeakReference<List<Integer>> currentTemplateIndexes = new WeakReference<>(null);
    final String StringContent_FileExtWithDot = ".txt";
    final String PackedContent_FileExtWithDot = ".zip";
    final String PackedContent_FileExtWithDotAlt = ".viz";
    final long maxSizeOfContentEntry = 100000000;

    public static boolean DetectVizFileTypeByFileSignature(ContentResolver contentResolver, Uri uri) {
        int read;
        byte[] bArr = new byte[2];
        try {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            read = openInputStream != null ? openInputStream.read(bArr) : 0;
            if (openInputStream != null) {
                openInputStream.close();
            }
        } catch (IOException | Exception unused) {
        }
        return read == 2 && bArr[0] == 80 && bArr[1] == 75;
    }

    public VisualizerSharingDesign() {
        VisualizerChooseDialog.onSaveToFileVisTemplateAction.subscribeWeak(new WeakEvent2.Handler<VisualizerChooseDialog, VisualizerThemeInfo>() { // from class: com.daaw.avee.Design.VisualizerSharingDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(VisualizerChooseDialog visualizerChooseDialog, VisualizerThemeInfo visualizerThemeInfo) {
                if (visualizerThemeInfo == null) {
                    return;
                }
                Activity activity = visualizerChooseDialog.getActivity();
                CustomScene prefThemeCustomizationDataOrTemplateData = VisualizerDesign.getPrefThemeCustomizationDataOrTemplateData(visualizerThemeInfo.id, null);
                if (prefThemeCustomizationDataOrTemplateData == null) {
                    return;
                }
                String serializePretty = prefThemeCustomizationDataOrTemplateData.serializePretty();
                String str = Environment.DIRECTORY_DOWNLOADS;
                String str2 = "visualizer_" + visualizerThemeInfo.id;
                File GetVisualizerFolderFromIdentifier = AppPreferences.GetVisualizerFolderFromIdentifier(visualizerThemeInfo.id);
                String SavePackedFileToPublicDirectory = VisualizerSharingDesign.this.SavePackedFileToPublicDirectory(visualizerChooseDialog.getActivity(), str, str2, ".viz", serializePretty, Arrays.asList(GetVisualizerFolderFromIdentifier != null ? GetVisualizerFolderFromIdentifier.listFiles() : new File[0]));
                UtilsFileSys.scanFile(activity, SavePackedFileToPublicDirectory);
                // String str3 = "Saved visualizer in " + str + "s";
                // String str3 = "Saved as " + str2 + " in " + str + "s";
                
                String extractedFilename = UtilsFileSys.extractFilename(SavePackedFileToPublicDirectory);
 
                String str3 = "Saved as " + extractedFilename + " in " + str + "s";

                VisualizerExporterDesign.showFileSavedNotification(2, activity, str3, Uri.parse(SavePackedFileToPublicDirectory), extractedFilename, "text/plain");
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(Uri.parse(SavePackedFileToPublicDirectory), "text/plain");
                PendingIntent activity2 = PendingIntent.getActivity(activity, 0, intent, 0);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(activity);
                builder.setContentTitle(extractedFilename).setContentText(str3).setSmallIcon(R.drawable.ic_save5).setContentIntent(activity2).setLocalOnly(true).setAutoCancel(true);
                ((NotificationManager) activity.getSystemService("notification")).notify(2, builder.build());
                EventsGlobalTextNotifier.onTextMsg.invoke(str3);
            }
        }, this.listenerRefHolder);
        VisualizerChooseDialog.onLoadFromFileVisTemplateAction.subscribeWeak(new WeakEvent2.Handler<VisualizerChooseDialog, List<Integer>>() { // from class: com.daaw.avee.Design.VisualizerSharingDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(VisualizerChooseDialog visualizerChooseDialog, List<Integer> list) {
                VisualizerSharingDesign.this.currentTemplateIndexes = new WeakReference<>(list);
                int i = Build.VERSION.SDK_INT;
                Intent intent = new Intent();
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                intent.setAction("android.intent.action.GET_CONTENT");
                visualizerChooseDialog.startActivityForResult(Intent.createChooser(intent, visualizerChooseDialog.getResources().getString(R.string.vis_action_loadFromFile_title)), 64);
            }
        }, this.listenerRefHolder);
        VisualizerChooseDialog.onActivityResult.subscribeWeak(new WeakEvent3.Handler<VisualizerChooseDialog, Integer, Intent>() { // from class: com.daaw.avee.Design.VisualizerSharingDesign.3
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(VisualizerChooseDialog visualizerChooseDialog, Integer num, Intent intent) {
                List<Integer> list = VisualizerSharingDesign.this.currentTemplateIndexes.get();
                if (list == null) {
                    return;
                }
                Activity activity = visualizerChooseDialog.getActivity();
                if (num.intValue() == 64) {
                    if (intent != null) {
                        VisualizerSharingDesign.this.onVisLoadFilePicked(activity, intent.getData(), list);
                        return;
                    }
                    tlog.w("PICK_IMAGE_PROPERTY_REQUEST_CODE invalid data");
                } else if (num.intValue() != 65 || Build.VERSION.SDK_INT < 19) {
                } else {
                    if (intent != null) {
                        VisualizerSharingDesign.this.onVisLoadFilePicked(activity, intent.getData(), list);
                        return;
                    }
                    tlog.w("PICK_IMAGE_PROPERTY_REQUEST_CODE_KITKAT invalid data");
                }
            }
        }, this.listenerRefHolder);
    }

    public static int AddNewVisualizerFromFile(Context context, Uri uri) {
        return onVisLoadFilePickedAsPackedContent(context, uri, AppPreferences.createOrGetInstance().getPrefThemeCustomizationIndexes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onVisLoadFilePicked(Context context, Uri uri, List<Integer> list) {
        String path = uri.getPath();
        int lastIndexOf = path.lastIndexOf(".txt");
        int lastIndexOf2 = path.lastIndexOf(StringContent_FileExtWithDotAlt);
        int max = Math.max(lastIndexOf, Math.max(lastIndexOf2, Math.max(path.lastIndexOf(".zip"), path.lastIndexOf(".viz"))));
        if (max == lastIndexOf || max == lastIndexOf2) {
            onVisLoadFilePickedAsStringContent(context, uri, list);
        } else {
            onVisLoadFilePickedAsPackedContent(context, uri, list);
        }
    }

    private void onVisLoadFilePickedAsStringContent(Context context, Uri uri, List<Integer> list) {
        if (uri == null) {
            return;
        }
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            String readInputStreamAsString = UtilsFileSys.readInputStreamAsString(openInputStream);
            if (readInputStreamAsString == null) {
                return;
            }
            VisualizerDesign.addNewVisualizer(CustomScene.deserialize(readInputStreamAsString), list, -1);
            openInputStream.close();
        } catch (FileNotFoundException | IOException unused) {
        }
    }

    private static int onVisLoadFilePickedAsPackedContent(Context context, Uri uri, List<Integer> list) {
        int i;
        InputStream openInputStream;
        ZipInputStream zipInputStream;
        int i2 = -1;
        if (uri == null) {
            return -1;
        }
        byte[] bArr = new byte[1024];
        try {
            openInputStream = context.getContentResolver().openInputStream(uri);
            zipInputStream = new ZipInputStream(openInputStream);
            i = VisualizerDesign.addNewVisualizer(CustomScene.deserialize(""), list, -1);
        } catch (FileNotFoundException | IOException unused) {
        }
        if (i < 0) {
            return -1;
        }
        try {
            File GetVisualizerFolderFromIdentifier = AppPreferences.GetVisualizerFolderFromIdentifier(i);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(new File(GetVisualizerFolderFromIdentifier, nextEntry.getName()));
                while (true) {
                    int read = zipInputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                fileOutputStream.close();
            }
            zipInputStream.close();
            openInputStream.close();
        } catch (FileNotFoundException | IOException unused2) {
            i2 = i;
            i = i2;
            Fix_TransferCustomizationDataFromLocalFile(i);
            return i;
        }
        Fix_TransferCustomizationDataFromLocalFile(i);
        return i;
    }

    static void Fix_TransferCustomizationDataFromLocalFile(int i) {
        File GetVisualizerFolderFromIdentifier;
        File[] listFiles;
        if (i >= 0 && (GetVisualizerFolderFromIdentifier = AppPreferences.GetVisualizerFolderFromIdentifier(i)) != null) {
            String str = null;
            File file = null;
            File file2 = null;
            for (File file3 : GetVisualizerFolderFromIdentifier.listFiles()) {
                if (StringContent_FileExtWithDotAlt.equals(UtilsFileSys.extractFilenameExtWithDot(file3.getName()))) {
                    file2 = file3;
                }
                if (PackedContent_SceneFileName.equals(file3.getName())) {
                    file = file3;
                }
            }
            if (file == null) {
                file = file2;
            }
            if (file != null) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    str = UtilsFileSys.readInputStreamAsString(fileInputStream);
                    fileInputStream.close();
                } catch (FileNotFoundException | IOException unused) {
                }
                try {
                    file.delete();
                } catch (Exception unused2) {
                }
            }
            if (str == null) {
                return;
            }
            AppPreferences.createOrGetInstance().savePrefThemeCustomizationData(i, CustomScene.deserialize(str), false);
        }
    }

    private String SaveFileToPublicDirectory(Context context, String str, String str2, String str3, String str4) {
        File file = null;
        int i = 0;
        for (int i2 = 0; i2 < 100; i2++) {
            file = i == 0 ? createFileToPublicDirectory(context, str, str2 + str3) : createFileToPublicDirectory(context, str, str2 + "(" + i + ")" + str3);
            if (file != null && !file.exists()) {
                break;
            }
            i++;
        }
        if (file != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(str4.getBytes());
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return file.getAbsolutePath();
        }
        return null;
    }

    private File createFileToPublicDirectory(Context context, String str, String str2) {
        try {
            File file = new File(Environment.getExternalStoragePublicDirectory(str), UtilsFileSys.fixToValidFilename(str2));
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.isDirectory()) {
                parentFile.mkdirs();
            }
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void createFile(DialogFragment dialogFragment, String str, String str2) {
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str);
        intent.putExtra("android.intent.extra.TITLE", str2);
        dialogFragment.startActivityForResult(intent, 63);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String SavePackedFileToPublicDirectory(Context context, String str, String str2, String str3, String str4, List<File> list) {
        File file = null;
        int i = 0;
        for (int i2 = 0; i2 < 100; i2++) {
            file = i == 0 ? createFileToPublicDirectory(context, str, str2 + str3) : createFileToPublicDirectory(context, str, str2 + "(" + i + ")" + str3);
            if (file != null && !file.exists()) {
                break;
            }
            i++;
        }
        if (file != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
                addToZipFile(str4, PackedContent_SceneFileName, zipOutputStream);
                for (File file2 : list) {
                    if (!PackedContent_SceneFileName.equals(file2.getName())) {
                        addToZipFile(file2, zipOutputStream);
                    }
                }
                zipOutputStream.close();
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return file.getAbsolutePath();
        }
        return null;
    }

    public static void addToZipFile(String str, String str2, ZipOutputStream zipOutputStream) throws FileNotFoundException, IOException {
        zipOutputStream.putNextEntry(new ZipEntry(str2));
        zipOutputStream.write(str.getBytes());
        zipOutputStream.closeEntry();
    }

    public static void addToZipFile(File file, ZipOutputStream zipOutputStream) throws FileNotFoundException, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read >= 0) {
                zipOutputStream.write(bArr, 0, read);
            } else {
                zipOutputStream.closeEntry();
                fileInputStream.close();
                return;
            }
        }
    }
}
