.class Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;
.super Ljava/lang/Object;
.source "CrashlyticsController.java"

# interfaces
.implements Lcom/google/android/gms/tasks/SuccessContinuation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1;->call()Lcom/google/android/gms/tasks/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/tasks/SuccessContinuation<",
        "Lcom/google/firebase/crashlytics/internal/settings/model/AppSettingsData;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$2:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1;

.field final synthetic val$dataCollectionToken:Z

.field final synthetic val$executor:Ljava/util/concurrent/Executor;

.field final synthetic val$reports:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1;Ljava/util/List;ZLjava/util/concurrent/Executor;)V
    .locals 0

    .line 580
    iput-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;->this$2:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1;

    iput-object p2, p0, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;->val$reports:Ljava/util/List;

    iput-boolean p3, p0, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;->val$dataCollectionToken:Z

    iput-object p4, p0, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;->val$executor:Ljava/util/concurrent/Executor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public then(Lcom/google/firebase/crashlytics/internal/settings/model/AppSettingsData;)Lcom/google/android/gms/tasks/Task;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/crashlytics/internal/settings/model/AppSettingsData;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 586
    invoke-static {}, Lcom/google/firebase/crashlytics/internal/Logger;->getLogger()Lcom/google/firebase/crashlytics/internal/Logger;

    move-result-object p1

    const-string v1, "Received null app settings, cannot send reports during app startup."

    .line 587
    invoke-virtual {p1, v1}, Lcom/google/firebase/crashlytics/internal/Logger;->w(Ljava/lang/String;)V

    .line 589
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1

    .line 594
    :cond_0
    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;->val$reports:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/crashlytics/internal/report/model/Report;

    .line 595
    invoke-interface {v2}, Lcom/google/firebase/crashlytics/internal/report/model/Report;->getType()Lcom/google/firebase/crashlytics/internal/report/model/Report$Type;

    move-result-object v3

    sget-object v4, Lcom/google/firebase/crashlytics/internal/report/model/Report$Type;->JAVA:Lcom/google/firebase/crashlytics/internal/report/model/Report$Type;

    if-ne v3, v4, :cond_1

    .line 596
    iget-object v3, p1, Lcom/google/firebase/crashlytics/internal/settings/model/AppSettingsData;->organizationId:Ljava/lang/String;

    .line 597
    invoke-interface {v2}, Lcom/google/firebase/crashlytics/internal/report/model/Report;->getFile()Ljava/io/File;

    move-result-object v2

    .line 596
    invoke-static {v3, v2}, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController;->access$1700(Ljava/lang/String;Ljava/io/File;)V

    goto :goto_0

    .line 600
    :cond_2
    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;->this$2:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1;->this$1:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8;->this$0:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController;

    invoke-static {v1}, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController;->access$1400(Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController;)Lcom/google/android/gms/tasks/Task;

    .line 601
    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;->this$2:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1;->this$1:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8;->this$0:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController;

    .line 602
    invoke-static {v1}, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController;->access$1800(Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController;)Lcom/google/firebase/crashlytics/internal/report/ReportUploader$Provider;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/google/firebase/crashlytics/internal/report/ReportUploader$Provider;->createReportUploader(Lcom/google/firebase/crashlytics/internal/settings/model/AppSettingsData;)Lcom/google/firebase/crashlytics/internal/report/ReportUploader;

    move-result-object v1

    .line 603
    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;->val$reports:Ljava/util/List;

    iget-boolean v3, p0, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;->val$dataCollectionToken:Z

    iget-object v4, p0, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;->this$2:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1;

    iget-object v4, v4, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1;->this$1:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8;

    iget v4, v4, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8;->val$delay:F

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/firebase/crashlytics/internal/report/ReportUploader;->uploadReportsAsync(Ljava/util/List;ZF)V

    .line 604
    iget-object v1, p0, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;->this$2:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1;->this$1:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8;

    iget-object v1, v1, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8;->this$0:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController;

    invoke-static {v1}, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController;->access$700(Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController;)Lcom/google/firebase/crashlytics/internal/common/SessionReportingCoordinator;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;->val$executor:Ljava/util/concurrent/Executor;

    .line 605
    invoke-static {p1}, Lcom/google/firebase/crashlytics/internal/common/DataTransportState;->getState(Lcom/google/firebase/crashlytics/internal/settings/model/AppSettingsData;)Lcom/google/firebase/crashlytics/internal/common/DataTransportState;

    move-result-object p1

    .line 604
    invoke-virtual {v1, v2, p1}, Lcom/google/firebase/crashlytics/internal/common/SessionReportingCoordinator;->sendReports(Ljava/util/concurrent/Executor;Lcom/google/firebase/crashlytics/internal/common/DataTransportState;)Lcom/google/android/gms/tasks/Task;

    .line 606
    iget-object p1, p0, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;->this$2:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1;

    iget-object p1, p1, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1;->this$1:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8;

    iget-object p1, p1, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8;->this$0:Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController;

    iget-object p1, p1, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController;->unsentReportsHandled:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetResult(Ljava/lang/Object;)Z

    .line 608
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 580
    check-cast p1, Lcom/google/firebase/crashlytics/internal/settings/model/AppSettingsData;

    invoke-virtual {p0, p1}, Lcom/google/firebase/crashlytics/internal/common/CrashlyticsController$8$1$1;->then(Lcom/google/firebase/crashlytics/internal/settings/model/AppSettingsData;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
