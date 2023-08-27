.class Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;
.super Ljava/lang/Object;
.source "VisualizerExporterDesign.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/Design/VisualizerExporterDesign;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ExportingStats"
.end annotation


# instance fields
.field public criticalFailure:Z

.field final synthetic this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;


# direct methods
.method private constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;->this$0:Lcom/daaw/avee/Design/VisualizerExporterDesign;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 151
    iput-boolean p1, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;->criticalFailure:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;Lcom/daaw/avee/Design/VisualizerExporterDesign$1;)V
    .locals 0

    .line 149
    invoke-direct {p0, p1}, Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;-><init>(Lcom/daaw/avee/Design/VisualizerExporterDesign;)V

    return-void
.end method


# virtual methods
.method reset()V
    .locals 1

    const/4 v0, 0x0

    .line 155
    iput-boolean v0, p0, Lcom/daaw/avee/Design/VisualizerExporterDesign$ExportingStats;->criticalFailure:Z

    return-void
.end method
