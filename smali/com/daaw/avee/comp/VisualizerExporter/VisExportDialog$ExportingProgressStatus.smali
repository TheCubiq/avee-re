.class public Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog$ExportingProgressStatus;
.super Ljava/lang/Object;
.source "VisExportDialog.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/VisualizerExporter/VisExportDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ExportingProgressStatus"
.end annotation


# instance fields
.field public active:Z

.field public isLoadingResources:Z

.field public progressMax:I

.field public progressValue:I

.field public statText:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 476
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
