package com.google.firebase.crashlytics.internal.persistence;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsDataProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public class CrashlyticsReportPersistence {
    private static final String EVENT_COUNTER_FORMAT = "%010d";
    private static final int EVENT_COUNTER_WIDTH = 10;
    private static final String EVENT_FILE_NAME_PREFIX = "event";
    private static final int MAX_OPEN_SESSIONS = 8;
    private static final String NATIVE_REPORTS_DIRECTORY = "native-reports";
    private static final String NORMAL_EVENT_SUFFIX = "";
    private static final String OPEN_SESSIONS_DIRECTORY_NAME = "sessions";
    private static final String PRIORITY_EVENT_SUFFIX = "_";
    private static final String PRIORITY_REPORTS_DIRECTORY = "priority-reports";
    private static final String REPORTS_DIRECTORY = "reports";
    private static final String REPORT_FILE_NAME = "report";
    private static final String USER_FILE_NAME = "user";
    private static final String WORKING_DIRECTORY_NAME = "report-persistence";
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final File nativeReportsDirectory;
    private final File openSessionsDirectory;
    private final File priorityReportsDirectory;
    private final File reportsDirectory;
    private final SettingsDataProvider settingsDataProvider;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final int EVENT_NAME_LENGTH = 15;
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final Comparator<? super File> LATEST_SESSION_ID_FIRST_COMPARATOR = CrashlyticsReportPersistence$$Lambda$5.lambdaFactory$();
    private static final FilenameFilter EVENT_FILE_FILTER = CrashlyticsReportPersistence$$Lambda$6.lambdaFactory$();

    public CrashlyticsReportPersistence(File file, SettingsDataProvider settingsDataProvider) {
        File file2 = new File(file, WORKING_DIRECTORY_NAME);
        this.openSessionsDirectory = new File(file2, OPEN_SESSIONS_DIRECTORY_NAME);
        this.priorityReportsDirectory = new File(file2, PRIORITY_REPORTS_DIRECTORY);
        this.reportsDirectory = new File(file2, REPORTS_DIRECTORY);
        this.nativeReportsDirectory = new File(file2, NATIVE_REPORTS_DIRECTORY);
        this.settingsDataProvider = settingsDataProvider;
    }

    public void persistReport(CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.Session session = crashlyticsReport.getSession();
        if (session == null) {
            Logger.getLogger().d("Could not get session for report");
            return;
        }
        String identifier = session.getIdentifier();
        try {
            File prepareDirectory = prepareDirectory(getSessionDirectoryById(identifier));
            writeTextFile(new File(prepareDirectory, REPORT_FILE_NAME), TRANSFORM.reportToJson(crashlyticsReport));
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            logger.d("Could not persist report for session " + identifier, e);
        }
    }

    public void persistEvent(CrashlyticsReport.Session.Event event, String str) {
        persistEvent(event, str, false);
    }

    public void persistEvent(CrashlyticsReport.Session.Event event, String str, boolean z) {
        int i = this.settingsDataProvider.getSettings().getSessionData().maxCustomExceptionEvents;
        File sessionDirectoryById = getSessionDirectoryById(str);
        try {
            writeTextFile(new File(sessionDirectoryById, generateEventFilename(this.eventCounter.getAndIncrement(), z)), TRANSFORM.eventToJson(event));
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            logger.d("Could not persist event for session " + str, e);
        }
        trimEvents(sessionDirectoryById, i);
    }

    public void persistUserIdForSession(String str, String str2) {
        try {
            writeTextFile(new File(getSessionDirectoryById(str2), USER_FILE_NAME), str);
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            logger.d("Could not persist user ID for session " + str2, e);
        }
    }

    public void deleteAllReports() {
        for (File file : getAllFinalizedReportFiles()) {
            file.delete();
        }
    }

    public void deleteFinalizedReport(String str) {
        FilenameFilter lambdaFactory$ = CrashlyticsReportPersistence$$Lambda$1.lambdaFactory$(str);
        for (File file : combineReportFiles(getFilesInDirectory(this.priorityReportsDirectory, lambdaFactory$), getFilesInDirectory(this.nativeReportsDirectory, lambdaFactory$), getFilesInDirectory(this.reportsDirectory, lambdaFactory$))) {
            file.delete();
        }
    }

    public void finalizeReports(String str, long j) {
        for (File file : capAndGetOpenSessions(str)) {
            Logger logger = Logger.getLogger();
            logger.d("Finalizing report for session " + file.getName());
            synthesizeReport(file, j);
            recursiveDelete(file);
        }
        capFinalizedReports();
    }

    public void finalizeSessionWithNativeEvent(String str, CrashlyticsReport.FilesPayload filesPayload) {
        synthesizeNativeReportFile(new File(getSessionDirectoryById(str), REPORT_FILE_NAME), this.nativeReportsDirectory, filesPayload, str);
    }

    public List<CrashlyticsReportWithSessionId> loadFinalizedReports() {
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(allFinalizedReportFiles.size());
        for (File file : getAllFinalizedReportFiles()) {
            try {
                arrayList.add(CrashlyticsReportWithSessionId.create(TRANSFORM.reportFromJson(readTextFile(file)), file.getName()));
            } catch (IOException e) {
                Logger logger = Logger.getLogger();
                logger.d("Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        return arrayList;
    }

    private List<File> capAndGetOpenSessions(String str) {
        List<File> filesInDirectory = getFilesInDirectory(this.openSessionsDirectory, CrashlyticsReportPersistence$$Lambda$2.lambdaFactory$(str));
        Collections.sort(filesInDirectory, LATEST_SESSION_ID_FIRST_COMPARATOR);
        if (filesInDirectory.size() <= 8) {
            return filesInDirectory;
        }
        for (File file : filesInDirectory.subList(8, filesInDirectory.size())) {
            recursiveDelete(file);
        }
        return filesInDirectory.subList(0, 8);
    }

    public static /* synthetic */ boolean lambda$capAndGetOpenSessions$3(String str, File file) {
        return file.isDirectory() && !file.getName().equals(str);
    }

    private void capFinalizedReports() {
        int i = this.settingsDataProvider.getSettings().getSessionData().maxCompleteSessionsCount;
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        int size = allFinalizedReportFiles.size();
        if (size <= i) {
            return;
        }
        for (File file : allFinalizedReportFiles.subList(i, size)) {
            file.delete();
        }
    }

    private List<File> getAllFinalizedReportFiles() {
        return sortAndCombineReportFiles(combineReportFiles(getAllFilesInDirectory(this.priorityReportsDirectory), getAllFilesInDirectory(this.nativeReportsDirectory)), getAllFilesInDirectory(this.reportsDirectory));
    }

    private File getSessionDirectoryById(String str) {
        return new File(this.openSessionsDirectory, str);
    }

    private void synthesizeReport(File file, long j) {
        boolean z;
        List<File> filesInDirectory = getFilesInDirectory(file, EVENT_FILE_FILTER);
        if (filesInDirectory.isEmpty()) {
            Logger logger = Logger.getLogger();
            logger.d("Session " + file.getName() + " has no events.");
            return;
        }
        Collections.sort(filesInDirectory);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file2 : filesInDirectory) {
                try {
                    arrayList.add(TRANSFORM.eventFromJson(readTextFile(file2)));
                } catch (IOException e) {
                    Logger logger2 = Logger.getLogger();
                    logger2.d("Could not add event to report for " + file2, e);
                }
                if (z || isHighPriorityEventFile(file2.getName())) {
                    z = true;
                }
            }
        }
        String str = null;
        File file3 = new File(file, USER_FILE_NAME);
        if (file3.isFile()) {
            try {
                str = readTextFile(file3);
            } catch (IOException e2) {
                Logger logger3 = Logger.getLogger();
                logger3.d("Could not read user ID file in " + file.getName(), e2);
            }
        }
        synthesizeReportFile(new File(file, REPORT_FILE_NAME), z ? this.priorityReportsDirectory : this.reportsDirectory, arrayList, j, z, str);
    }

    private static void synthesizeNativeReportFile(File file, File file2, CrashlyticsReport.FilesPayload filesPayload, String str) {
        try {
            writeTextFile(new File(prepareDirectory(file2), str), TRANSFORM.reportToJson(TRANSFORM.reportFromJson(readTextFile(file)).withNdkPayload(filesPayload)));
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            logger.d("Could not synthesize final native report file for " + file, e);
        }
    }

    private static void synthesizeReportFile(File file, File file2, List<CrashlyticsReport.Session.Event> list, long j, boolean z, String str) {
        try {
            CrashlyticsReport withEvents = TRANSFORM.reportFromJson(readTextFile(file)).withSessionEndFields(j, z, str).withEvents(ImmutableList.from(list));
            CrashlyticsReport.Session session = withEvents.getSession();
            if (session == null) {
                return;
            }
            writeTextFile(new File(prepareDirectory(file2), session.getIdentifier()), TRANSFORM.reportToJson(withEvents));
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            logger.d("Could not synthesize final report file for " + file, e);
        }
    }

    private static List<File> sortAndCombineReportFiles(List<File>... listArr) {
        for (List<File> list : listArr) {
            Collections.sort(list, LATEST_SESSION_ID_FIRST_COMPARATOR);
        }
        return combineReportFiles(listArr);
    }

    private static List<File> combineReportFiles(List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (List<File> list : listArr) {
            i += list.size();
        }
        arrayList.ensureCapacity(i);
        for (List<File> list2 : listArr) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    private static boolean isHighPriorityEventFile(String str) {
        return str.startsWith("event") && str.endsWith(PRIORITY_EVENT_SUFFIX);
    }

    public static boolean isNormalPriorityEventFile(File file, String str) {
        return str.startsWith("event") && !str.endsWith(PRIORITY_EVENT_SUFFIX);
    }

    private static String generateEventFilename(int i, boolean z) {
        String format = String.format(Locale.US, EVENT_COUNTER_FORMAT, Integer.valueOf(i));
        String str = z ? PRIORITY_EVENT_SUFFIX : "";
        return "event" + format + str;
    }

    private static int trimEvents(File file, int i) {
        FilenameFilter filenameFilter;
        Comparator comparator;
        filenameFilter = CrashlyticsReportPersistence$$Lambda$3.instance;
        List<File> filesInDirectory = getFilesInDirectory(file, filenameFilter);
        comparator = CrashlyticsReportPersistence$$Lambda$4.instance;
        Collections.sort(filesInDirectory, comparator);
        return capFilesCount(filesInDirectory, i);
    }

    private static String getEventNameWithoutPriority(String str) {
        return str.substring(0, EVENT_NAME_LENGTH);
    }

    public static int oldestEventFileFirst(File file, File file2) {
        return getEventNameWithoutPriority(file.getName()).compareTo(getEventNameWithoutPriority(file2.getName()));
    }

    private static List<File> getAllFilesInDirectory(File file) {
        return getFilesInDirectory(file, (FileFilter) null);
    }

    private static List<File> getFilesInDirectory(File file, FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    private static List<File> getFilesInDirectory(File file, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    private static File prepareDirectory(File file) throws IOException {
        if (makeDirectory(file)) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    private static boolean makeDirectory(File file) {
        return file.exists() || file.mkdirs();
    }

    private static void writeTextFile(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), UTF_8);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    private static String readTextFile(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), UTF_8);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
    }

    private static int capFilesCount(List<File> list, int i) {
        int size = list.size();
        for (File file : list) {
            if (size <= i) {
                return size;
            }
            recursiveDelete(file);
            size--;
        }
        return size;
    }

    private static void recursiveDelete(File file) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }
}
