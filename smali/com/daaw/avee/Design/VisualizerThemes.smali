.class public Lcom/daaw/avee/Design/VisualizerThemes;
.super Ljava/lang/Object;
.source "VisualizerThemes.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/Design/VisualizerThemes$IVisualizerFactory2;,
        Lcom/daaw/avee/Design/VisualizerThemes$IVisualizerFactory;
    }
.end annotation


# static fields
.field public static ACTUAL_ROOT_VERSION:Ljava/lang/String; = "10"

.field private static color1:I = -0x1

.field private static color2:I = 0x60606060

.field private static instance:Lcom/daaw/avee/Design/VisualizerThemes; = null

.field private static textBlendMode:I = 0x4


# instance fields
.field private themesList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;",
            "Lcom/daaw/avee/Design/VisualizerThemes$IVisualizerFactory;",
            ">;>;"
        }
    .end annotation
.end field

.field private themesList2:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;",
            "Lcom/daaw/avee/Design/VisualizerThemes$IVisualizerFactory2;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 5

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList2:Ljava/util/List;

    .line 94
    sput-object p0, Lcom/daaw/avee/Design/VisualizerThemes;->instance:Lcom/daaw/avee/Design/VisualizerThemes;

    .line 96
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$1;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$1;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$2;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$2;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$3;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$3;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 115
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$4;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$4;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$5;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$5;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$6;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$6;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$7;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$7;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$8;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$8;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$9;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$9;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$10;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$10;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$11;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$11;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$12;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$12;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 172
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$13;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$13;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 178
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$14;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$14;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 184
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$15;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$15;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 190
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$16;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$16;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$17;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$17;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 208
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    new-instance v1, Lcom/daaw/avee/Common/Tuple2;

    new-instance v2, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v3, Lcom/daaw/avee/Design/VisualizerThemes$18;

    invoke-direct {v3, p0}, Lcom/daaw/avee/Design/VisualizerThemes$18;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v1, v2, v3}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x12

    if-ge v0, v1, :cond_0

    .line 232
    iget-object v1, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList2:Ljava/util/List;

    new-instance v2, Lcom/daaw/avee/Common/Tuple2;

    new-instance v3, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;-><init>(I)V

    new-instance v4, Lcom/daaw/avee/Design/VisualizerThemes$19;

    invoke-direct {v4, p0}, Lcom/daaw/avee/Design/VisualizerThemes$19;-><init>(Lcom/daaw/avee/Design/VisualizerThemes;)V

    invoke-direct {v2, v3, v4}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic access$000(ILjava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 0

    .line 50
    invoke-static {p0, p1}, Lcom/daaw/avee/Design/VisualizerThemes;->createVisPreset0(ILjava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/Design/VisualizerThemes;IZ)Lcom/daaw/avee/comp/Visualizer/CustomScene;
    .locals 0

    .line 50
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerThemes;->getThemeObject2(IZ)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p0

    return-object p0
.end method

.method static createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 2

    .line 355
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    sget-object v1, Lcom/daaw/avee/Design/VisualizerThemes;->ACTUAL_ROOT_VERSION:Ljava/lang/String;

    invoke-direct {v0, v1, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;-><init>(Ljava/lang/String;I)V

    .line 356
    new-instance p0, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>(Z)V

    .line 357
    invoke-virtual {v0, p0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    return-object v0
.end method

.method private static createVisPreset0(ILjava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 8

    .line 426
    invoke-static {p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    .line 430
    new-instance p1, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 431
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;-><init>()V

    const/16 v1, 0xd

    .line 432
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioWaveformData;->setSampleInCountPower(I)V

    .line 433
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 438
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/4 v1, 0x0

    .line 439
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    const/4 v2, 0x0

    .line 440
    invoke-virtual {v0, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    .line 441
    invoke-virtual {v0, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPosition(FF)V

    const/high16 v3, 0x3f800000    # 1.0f

    .line 442
    invoke-virtual {v0, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 447
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 448
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathHorizontalLine;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathHorizontalLine;-><init>()V

    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 449
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    const/4 v6, -0x1

    const v7, 0xffffff

    invoke-virtual {v5, v7, v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 450
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    invoke-virtual {v5, v7, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v5

    const v6, 0x3e99999a    # 0.3f

    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer2(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    const/high16 v5, 0x3f000000    # 0.5f

    .line 451
    invoke-virtual {v4, v2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    .line 452
    invoke-virtual {v4, v2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setLocalPosition(FF)V

    const v2, 0x3f4ccccd    # 0.8f

    .line 453
    invoke-virtual {v4, v3, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    .line 454
    invoke-virtual {v4, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBlendMode(I)V

    .line 457
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 458
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 459
    invoke-virtual {p0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    const/4 p1, 0x0

    const/4 v0, 0x1

    .line 461
    invoke-static {p0, p1, v0}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    return-object p0
.end method

.method static createVisPreset1(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 12

    .line 466
    invoke-static {p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    .line 468
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 469
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v2, 0x1

    .line 470
    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/16 v3, 0x3f

    const v4, 0x3d75c28f    # 0.06f

    const/4 v5, 0x4

    .line 471
    invoke-virtual {v1, v3, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFI)V

    .line 473
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 476
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/4 v4, 0x0

    .line 477
    invoke-virtual {v3, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    const/high16 v5, 0x3f800000    # 1.0f

    .line 478
    invoke-virtual {v3, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 480
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;-><init>()V

    const/high16 v7, 0x3f000000    # 0.5f

    .line 481
    invoke-virtual {v6, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPosition(FF)V

    .line 482
    invoke-virtual {v6, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setScale(FF)V

    const/16 v8, 0x3e8

    .line 483
    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesCountLimit(I)V

    const v8, 0x3d4ccccd    # 0.05f

    .line 484
    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesSpawnTime(F)V

    .line 485
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;-><init>()V

    const/high16 v9, 0x43870000    # 270.0f

    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;->setVectorAngle(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    move-result-object v8

    invoke-virtual {v8, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;->setUseRandomVectorInstead(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    move-result-object v8

    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setArea(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)V

    const/4 v8, 0x2

    .line 486
    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setBlendMode(I)V

    .line 488
    invoke-virtual {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getParticlesFactory()Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;

    move-result-object v8

    const/high16 v9, 0x40800000    # 4.0f

    .line 489
    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSideSineWaveFreq(F)V

    const/high16 v10, 0x40000000    # 2.0f

    .line 490
    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSideSineWaveFreqRandom(F)V

    .line 491
    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSideSineWaveMag(F)V

    .line 492
    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSideSineWaveMagRandom(F)V

    const/high16 v10, 0x3fc00000    # 1.5f

    .line 494
    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setLifetime(F)V

    const v10, 0x3e99999a    # 0.3f

    .line 495
    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInAndOutTime(F)V

    .line 496
    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setStartSize(F)V

    .line 497
    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInSize(F)V

    .line 498
    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSize(F)V

    const v9, -0x33333334

    .line 499
    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorBoth(I)V

    const/high16 v9, 0x43160000    # 150.0f

    .line 500
    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeed(F)V

    .line 501
    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setTrailLength(F)V

    .line 562
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 563
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathHorizontalLine;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathHorizontalLine;-><init>()V

    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 564
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;-><init>()V

    const v10, 0x3f4ccccd    # 0.8f

    invoke-virtual {v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;

    move-result-object v9

    const v10, -0x7f000001

    const/4 v11, -0x1

    invoke-virtual {v9, v10, v11, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    const v9, 0x3f79999a    # 0.975f

    .line 565
    invoke-virtual {v8, v7, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    .line 566
    invoke-virtual {v8, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPositionUniform(ZZ)V

    .line 567
    invoke-virtual {v8, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setLocalPosition(FF)V

    .line 568
    invoke-virtual {v8, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    const v4, 0x3b449ba6    # 0.003f

    .line 569
    invoke-virtual {v8, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    const/4 v4, 0x5

    .line 570
    invoke-virtual {v8, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    const/high16 v4, 0x40200000    # 2.5f

    .line 571
    invoke-virtual {v8, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    .line 573
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 574
    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 575
    invoke-virtual {p0, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 576
    invoke-virtual {p0, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 578
    invoke-static {p0, v1, v2}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    return-object p0
.end method

.method static createVisPreset10(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 16

    .line 1447
    invoke-static/range {p0 .. p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    .line 1449
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 1450
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v3, 0x2

    .line 1451
    invoke-virtual {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/16 v4, 0xb

    .line 1452
    invoke-virtual {v2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleInCountPower(I)V

    const v4, 0x3d4ccccd    # 0.05f

    const/4 v5, 0x0

    const/16 v6, 0x82

    .line 1453
    invoke-virtual {v2, v6, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFI)V

    .line 1455
    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 1457
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/high16 v7, 0x3f800000    # 1.0f

    .line 1458
    invoke-virtual {v6, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const v8, -0x4f4f50

    .line 1459
    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    const/4 v8, 0x1

    .line 1460
    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    .line 1462
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;-><init>()V

    const/high16 v10, 0x3f000000    # 0.5f

    .line 1463
    invoke-virtual {v9, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPosition(FF)V

    .line 1464
    invoke-virtual {v9, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setScale(FF)V

    const/16 v11, 0x3e8

    .line 1465
    invoke-virtual {v9, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesCountLimit(I)V

    .line 1466
    invoke-virtual {v9, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesSpawnTime(F)V

    .line 1467
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;-><init>()V

    invoke-virtual {v4, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;->setUseRandomVectorInstead(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    move-result-object v4

    invoke-virtual {v9, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setArea(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)V

    .line 1468
    invoke-virtual {v9, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setBlendMode(I)V

    .line 1469
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;-><init>()V

    invoke-virtual {v9, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setForceField(Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;)V

    .line 1470
    sget-object v4, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->internalParticles:[Ljava/lang/String;

    aget-object v4, v4, v3

    invoke-virtual {v9, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setCustomImage(Ljava/lang/String;)V

    .line 1472
    invoke-virtual {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getParticlesFactory()Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;

    move-result-object v4

    const/high16 v11, -0x330c0000

    .line 1473
    invoke-virtual {v4, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorTo(I)V

    const v11, -0x3300f59d

    .line 1474
    invoke-virtual {v4, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorFrom(I)V

    const/high16 v11, 0x41000000    # 8.0f

    .line 1475
    invoke-virtual {v4, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setLifetime(F)V

    const v11, 0x3dcccccd    # 0.1f

    .line 1476
    invoke-virtual {v4, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInAndOutTime(F)V

    const/high16 v11, 0x40800000    # 4.0f

    .line 1478
    invoke-virtual {v4, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setStartSize(F)V

    .line 1479
    invoke-virtual {v4, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInSize(F)V

    const/high16 v11, 0x40b00000    # 5.5f

    .line 1480
    invoke-virtual {v4, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSize(F)V

    const/4 v11, 0x0

    .line 1481
    invoke-virtual {v4, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSizeRandom(F)V

    .line 1482
    invoke-virtual {v4, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeed(F)V

    .line 1483
    invoke-virtual {v4, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeedRandom(F)V

    const v11, 0x3e4ccccd    # 0.2f

    .line 1485
    invoke-virtual {v4, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setTrailLength(F)V

    .line 1559
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    const/4 v12, 0x4

    .line 1561
    invoke-virtual {v4, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBlendMode(I)V

    .line 1562
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {v4, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 1563
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    invoke-direct {v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;-><init>()V

    const v14, 0x3e99999a    # 0.3f

    invoke-virtual {v13, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    move-result-object v13

    invoke-virtual {v13, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    move-result-object v13

    const/high16 v14, -0x7f020000

    const v15, -0x7fff0001

    const/high16 v3, -0x7f010000

    invoke-virtual {v13, v3, v15, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v13

    invoke-virtual {v4, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 1564
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    invoke-direct {v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;-><init>()V

    const v7, 0x3f666666    # 0.9f

    invoke-virtual {v13, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    move-result-object v7

    invoke-virtual {v7, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    move-result-object v7

    invoke-virtual {v7, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v7

    invoke-virtual {v7, v3, v15, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer2(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 1565
    invoke-virtual {v4, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    .line 1566
    invoke-virtual {v4, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    const v3, 0x3c23d70a    # 0.01f

    .line 1568
    invoke-virtual {v4, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    const/high16 v3, 0x40400000    # 3.0f

    .line 1569
    invoke-virtual {v4, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    .line 1570
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const-string v7, "TotalTimeWhenPlaying"

    const v11, 0x3cf5c28f    # 0.03f

    invoke-direct {v3, v7, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v4, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMeasureRot(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    const/4 v3, 0x6

    .line 1571
    invoke-virtual {v4, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 1573
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    .line 1574
    invoke-virtual {v3, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    const v7, -0xe2c85b

    .line 1575
    invoke-virtual {v3, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    .line 1576
    invoke-virtual {v3, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    .line 1577
    invoke-virtual {v3, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendModeContent(I)V

    const/high16 v7, 0x3f800000    # 1.0f

    .line 1578
    invoke-virtual {v3, v5, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    const v7, 0x3f83d70a    # 1.03f

    .line 1579
    invoke-virtual {v3, v8, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    const v7, 0x3f87ae14    # 1.06f

    const/4 v11, 0x2

    .line 1580
    invoke-virtual {v3, v11, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    .line 1582
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 1583
    invoke-virtual {v7, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 1584
    invoke-virtual {v7, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    .line 1585
    invoke-virtual {v7, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    .line 1586
    invoke-virtual {v7, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 1587
    invoke-virtual {v7, v8, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 1588
    invoke-virtual {v7, v8, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 1589
    invoke-virtual {v7, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setCircleShape(Z)V

    .line 1594
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>()V

    .line 1595
    invoke-virtual {v0, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    .line 1596
    invoke-virtual {v5, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1600
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1601
    invoke-virtual {v0, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1602
    invoke-virtual {v0, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1603
    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1604
    invoke-virtual {v0, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1606
    invoke-static {v0, v2, v8}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    return-object v0
.end method

.method static createVisPreset11(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 12

    .line 1611
    invoke-static {p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    .line 1613
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 1614
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v9, 0x1

    .line 1615
    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/high16 v10, 0x3f000000    # 0.5f

    .line 1616
    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setAweightFft(F)V

    const/16 v2, 0xb4

    const/4 v3, 0x0

    const v4, 0x468ca000    # 18000.0f

    const/4 v5, 0x0

    const/4 v6, 0x2

    const v7, 0x3dcccccd    # 0.1f

    move-object v1, v8

    .line 1617
    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFFZIF)V

    .line 1619
    invoke-virtual {v0, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 1621
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/4 v2, -0x1

    .line 1622
    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    const/high16 v3, 0x3f800000    # 1.0f

    .line 1623
    invoke-virtual {v1, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const/4 v4, 0x7

    .line 1624
    invoke-virtual {v1, v9, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(ZII)V

    .line 1626
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;-><init>()V

    .line 1627
    invoke-virtual {v4, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setColor(I)V

    .line 1628
    sget v5, Lcom/daaw/avee/Design/VisualizerThemes;->textBlendMode:I

    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setBlendMode(I)V

    const/16 v5, 0x46

    .line 1629
    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setFontSize(I)V

    const-string v5, "{Artist}"

    .line 1630
    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setText(Ljava/lang/String;)V

    const v5, 0x3f4ccccd    # 0.8f

    .line 1631
    invoke-virtual {v4, v10, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setPosition(FF)V

    const/4 v6, 0x0

    .line 1632
    invoke-virtual {v4, v10, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setLocalPosition(FF)V

    .line 1634
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;-><init>()V

    .line 1635
    invoke-virtual {v6, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setColor(I)V

    .line 1636
    sget v7, Lcom/daaw/avee/Design/VisualizerThemes;->textBlendMode:I

    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setBlendMode(I)V

    const/16 v7, 0x28

    .line 1637
    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setFontSize(I)V

    const-string v7, "{Title}"

    .line 1638
    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setText(Ljava/lang/String;)V

    .line 1639
    invoke-virtual {v6, v10, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setPosition(FF)V

    const/high16 v5, -0x40800000    # -1.0f

    .line 1640
    invoke-virtual {v6, v10, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setLocalPosition(FF)V

    .line 1642
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 1643
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathLetter;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathLetter;-><init>()V

    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 1644
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    const/4 v11, 0x0

    invoke-virtual {v7, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    move-result-object v7

    invoke-virtual {v7, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setColor(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v2

    invoke-virtual {v5, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 1645
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    invoke-virtual {v2, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    move-result-object v2

    const/high16 v7, -0x800000    # Float.NEGATIVE_INFINITY

    invoke-virtual {v2, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setColor(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v2

    const v7, 0x3f19999a    # 0.6f

    invoke-virtual {v2, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v2

    invoke-virtual {v5, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer2(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 1646
    invoke-virtual {v5, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    .line 1647
    invoke-virtual {v5, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    const/high16 v2, 0x40400000    # 3.0f

    .line 1648
    invoke-virtual {v5, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const v2, 0x3b449ba6    # 0.003f

    .line 1649
    invoke-virtual {v5, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    .line 1659
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    const v7, -0xd98744

    .line 1660
    invoke-virtual {v2, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    .line 1661
    invoke-virtual {v2, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    .line 1662
    invoke-virtual {v2, v11, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    const v3, 0x3f333333    # 0.7f

    .line 1665
    invoke-virtual {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurRadius(F)V

    .line 1666
    invoke-virtual {v2, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    .line 1670
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>()V

    .line 1671
    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    .line 1673
    invoke-virtual {v3, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1674
    invoke-virtual {v3, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1675
    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1677
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1678
    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1679
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1681
    invoke-static {p0, v8, v9}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    return-object p0
.end method

.method static createVisPreset12(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 15

    .line 1686
    invoke-static {p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    .line 1688
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 1689
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v12, 0x2

    .line 1690
    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/16 v1, 0xb

    .line 1691
    invoke-virtual {v11, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleInCountPower(I)V

    const/16 v2, 0xe6

    const/high16 v3, 0x41700000    # 15.0f

    const v4, 0x44898000    # 1100.0f

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/high16 v7, 0x3f800000    # 1.0f

    const/16 v8, 0xf

    const/16 v9, 0xf

    const v10, 0x3ecccccd    # 0.4f

    move-object v1, v11

    .line 1692
    invoke-virtual/range {v1 .. v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFFZIFIIF)V

    const/high16 v1, 0x428c0000    # 70.0f

    .line 1694
    invoke-virtual {v11, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSteadySmooth(F)V

    const v1, 0x3e99999a    # 0.3f

    .line 1697
    invoke-virtual {v11, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setAweightFft(F)V

    const/high16 v2, 0x40000000    # 2.0f

    const/4 v3, 0x3

    .line 1698
    invoke-virtual {v11, v3, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setFftFilter(IF)V

    const/4 v3, 0x0

    const/high16 v4, 0x3e800000    # 0.25f

    const v5, 0x3f333333    # 0.7f

    const/high16 v6, 0x420c0000    # 35.0f

    .line 1699
    invoke-virtual {v11, v3, v4, v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setBeatRangeCorners(FFFF)V

    .line 1700
    invoke-virtual {v0, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 1702
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/high16 v4, 0x3f800000    # 1.0f

    .line 1703
    invoke-virtual {v3, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const v5, 0x3f8ccccd    # 1.1f

    .line 1704
    invoke-virtual {v3, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const/4 v5, -0x1

    .line 1705
    invoke-virtual {v3, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    const/4 v5, 0x0

    .line 1706
    invoke-virtual {v3, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    const/4 v6, 0x1

    .line 1708
    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    .line 1711
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 1712
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const-string v9, "BeatRandomShake"

    invoke-direct {v8, v9, v1, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v7, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMeasurePos(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 1713
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {v7, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 1714
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;-><init>()V

    invoke-virtual {v8, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    move-result-object v2

    const/high16 v8, -0x1000000

    invoke-virtual {v2, v8, v8, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v2

    invoke-virtual {v7, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    const/high16 v2, 0x3f000000    # 0.5f

    .line 1716
    invoke-virtual {v7, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    const v10, 0x3eca3d71    # 0.395f

    .line 1717
    invoke-virtual {v7, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    .line 1718
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v13, 0x3e19999a    # 0.15f

    const-string v14, "Beat"

    invoke-direct {v10, v14, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v7, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    const v10, 0x3c23d70a    # 0.01f

    .line 1719
    invoke-virtual {v7, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    const/high16 v10, 0x40800000    # 4.0f

    .line 1720
    invoke-virtual {v7, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const v10, 0x3e2aaaab

    .line 1721
    invoke-virtual {v7, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setRot(F)V

    const/16 v10, 0xa

    .line 1722
    invoke-virtual {v7, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 1724
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v10}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    .line 1725
    invoke-virtual {v10, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    .line 1727
    invoke-virtual {v10, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    .line 1728
    invoke-virtual {v10, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    .line 1729
    invoke-virtual {v10, v5, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    .line 1731
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v12}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 1732
    invoke-virtual {v12, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 1733
    invoke-virtual {v12, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    .line 1734
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-direct {v5, v9, v1, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v12, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setMeasurePos(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 1735
    invoke-virtual {v12, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    const v1, 0x3ecccccd    # 0.4f

    .line 1736
    invoke-virtual {v12, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 1737
    invoke-virtual {v12, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 1738
    invoke-virtual {v12, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 1739
    invoke-virtual {v12, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setCircleShape(Z)V

    .line 1740
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-direct {v1, v14, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v12, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 1741
    invoke-virtual {v12, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setGeneratedAlbumArtColor(I)V

    .line 1746
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1747
    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1748
    invoke-virtual {p0, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1749
    invoke-virtual {p0, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1750
    invoke-virtual {p0, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1752
    invoke-static {p0, v11, v6}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    return-object p0
.end method

.method static createVisPreset13(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 12

    .line 1757
    invoke-static {p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    .line 1759
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 1760
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v2, 0x2

    .line 1761
    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/4 v2, 0x0

    const/16 v3, 0x64

    const v4, 0x3d75c28f    # 0.06f

    .line 1764
    invoke-virtual {v1, v3, v4, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFI)V

    .line 1765
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 1767
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/high16 v4, 0x3f800000    # 1.0f

    .line 1768
    invoke-virtual {v3, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 1769
    invoke-virtual {v3, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    const/4 v5, 0x3

    .line 1770
    invoke-virtual {v3, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    const v5, -0x4f4f50

    .line 1771
    invoke-virtual {v3, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    .line 1773
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;-><init>()V

    .line 1774
    sget v6, Lcom/daaw/avee/Design/VisualizerThemes;->color1:I

    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setColor(I)V

    .line 1775
    sget v6, Lcom/daaw/avee/Design/VisualizerThemes;->textBlendMode:I

    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setBlendMode(I)V

    const/16 v6, 0x28

    .line 1776
    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setFontSize(I)V

    const-string v6, "{TimeCurrent}"

    .line 1777
    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setText(Ljava/lang/String;)V

    const/high16 v6, 0x3f000000    # 0.5f

    .line 1779
    invoke-virtual {v5, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setPosition(FF)V

    const/high16 v7, -0x3fc00000    # -3.0f

    .line 1780
    invoke-virtual {v5, v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setLocalPosition(FF)V

    .line 1783
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 1784
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathHorizontalLine;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathHorizontalLine;-><init>()V

    invoke-virtual {v7, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 1785
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;-><init>()V

    const/4 v9, 0x1

    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    move-result-object v8

    const/4 v10, -0x1

    const v11, 0xffffff

    invoke-virtual {v8, v10, v11, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 1786
    invoke-virtual {v7, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    const/high16 v8, -0x40800000    # -1.0f

    .line 1787
    invoke-virtual {v7, v4, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    const v8, 0x3b449ba6    # 0.003f

    .line 1788
    invoke-virtual {v7, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    .line 1790
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 1791
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 1792
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    invoke-virtual {v10, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setFlipEveryOther(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    move-result-object v10

    const/high16 v11, 0x40a00000    # 5.0f

    invoke-virtual {v10, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setFixedLineHeight(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v10

    invoke-virtual {v10, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v10

    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 1793
    invoke-virtual {v8, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    const v10, 0x3f19999a    # 0.6f

    .line 1794
    invoke-virtual {v8, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    const/high16 v10, 0x40000000    # 2.0f

    .line 1795
    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const/4 v10, 0x0

    .line 1796
    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    .line 1798
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v10}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    .line 1799
    invoke-virtual {v10, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    .line 1800
    invoke-virtual {v10, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    .line 1801
    invoke-virtual {v10, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    const/4 v11, 0x4

    .line 1802
    invoke-virtual {v10, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendModeContent(I)V

    .line 1803
    invoke-virtual {v10, v2, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    const v4, 0x3ecccccd    # 0.4f

    .line 1804
    invoke-virtual {v10, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurRadius(F)V

    .line 1806
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 1807
    invoke-virtual {v4, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 1808
    invoke-virtual {v4, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    .line 1809
    invoke-virtual {v4, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    const v6, 0x3e99999a    # 0.3f

    .line 1810
    invoke-virtual {v4, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 1811
    invoke-virtual {v4, v9, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 1812
    invoke-virtual {v4, v9, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 1813
    invoke-virtual {v4, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setCircleShape(Z)V

    .line 1814
    invoke-virtual {v4, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setGeneratedAlbumArtColor(I)V

    .line 1815
    invoke-virtual {v4, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    .line 1817
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>()V

    .line 1818
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    .line 1819
    invoke-virtual {v2, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1820
    invoke-virtual {v2, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1822
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1823
    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1825
    invoke-virtual {p0, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1826
    invoke-virtual {p0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1828
    invoke-virtual {p0, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1831
    invoke-static {p0, v1, v9}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    return-object p0
.end method

.method static createVisPreset14(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 16

    .line 1837
    invoke-static/range {p0 .. p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    .line 1839
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 1840
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v13, 0x2

    .line 1841
    invoke-virtual {v12, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/16 v2, 0xb

    .line 1842
    invoke-virtual {v12, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleInCountPower(I)V

    const/16 v3, 0xb4

    const/high16 v4, 0x41700000    # 15.0f

    const v5, 0x44898000    # 1100.0f

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/high16 v8, 0x3f800000    # 1.0f

    const/16 v9, 0x19

    const/16 v10, 0x19

    const/4 v11, 0x0

    move-object v2, v12

    .line 1844
    invoke-virtual/range {v2 .. v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFFZIFIIF)V

    const/high16 v2, 0x428c0000    # 70.0f

    .line 1846
    invoke-virtual {v12, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSteadySmooth(F)V

    const/high16 v2, 0x40000000    # 2.0f

    const/4 v3, 0x4

    .line 1849
    invoke-virtual {v12, v3, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setFftFilter(IF)V

    .line 1850
    invoke-virtual {v1, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 1852
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/high16 v5, 0x3f800000    # 1.0f

    .line 1853
    invoke-virtual {v4, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const v6, 0x3f8ccccd    # 1.1f

    .line 1854
    invoke-virtual {v4, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const v6, -0x4f4f50

    .line 1855
    invoke-virtual {v4, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    const/high16 v6, -0x1000000

    .line 1856
    invoke-virtual {v4, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setGeneratedAlbumArtColor(I)V

    .line 1858
    invoke-virtual {v4, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    .line 1869
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;-><init>()V

    const/high16 v9, 0x3f000000    # 0.5f

    .line 1870
    invoke-virtual {v8, v9, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPosition(FF)V

    const v10, 0x3e99999a    # 0.3f

    .line 1871
    invoke-virtual {v8, v5, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setScale(FF)V

    const/16 v10, 0x5dc

    .line 1872
    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesCountLimit(I)V

    const v10, 0x3ca3d70a    # 0.02f

    .line 1873
    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesSpawnTime(F)V

    .line 1875
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    invoke-direct {v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;-><init>()V

    invoke-virtual {v10, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;->setVectorZ(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    move-result-object v10

    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setArea(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)V

    .line 1876
    invoke-virtual {v8, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setBlendMode(I)V

    .line 1877
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const-string v11, "Beat"

    const/high16 v14, 0x3fc00000    # 1.5f

    invoke-direct {v10, v11, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v8, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setMeasureOverallSpeed(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 1878
    invoke-virtual {v8, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setMirrorX(Z)V

    .line 1879
    invoke-virtual {v8, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesScale(F)V

    .line 1880
    sget-object v2, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->internalParticles:[Ljava/lang/String;

    const/4 v10, 0x0

    aget-object v2, v2, v10

    invoke-virtual {v8, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setCustomImage(Ljava/lang/String;)V

    const/high16 v2, 0x44610000    # 900.0f

    .line 1881
    invoke-virtual {v8, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPerspectiveDepth(F)V

    const/high16 v2, 0x43160000    # 150.0f

    .line 1882
    invoke-virtual {v8, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPerspectiveFov(F)V

    .line 1884
    invoke-virtual {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getParticlesFactory()Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;

    move-result-object v2

    .line 1886
    invoke-virtual {v2, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSideSineWaveFreq(F)V

    const/high16 v14, 0x3e800000    # 0.25f

    .line 1887
    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSideSineWaveMag(F)V

    const/4 v14, -0x1

    .line 1889
    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorFrom(I)V

    const v14, -0x33333334

    .line 1890
    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorTo(I)V

    const/high16 v14, 0x41000000    # 8.0f

    .line 1891
    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setLifetime(F)V

    const v14, 0x3dcccccd    # 0.1f

    .line 1892
    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInAndOutTime(F)V

    const/4 v14, 0x0

    .line 1893
    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setStartSize(F)V

    const/high16 v14, 0x40800000    # 4.0f

    .line 1894
    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInSize(F)V

    .line 1895
    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSize(F)V

    const/high16 v14, 0x41200000    # 10.0f

    .line 1896
    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSizeRandom(F)V

    const/high16 v14, 0x42c80000    # 100.0f

    .line 1897
    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeed(F)V

    const/high16 v14, 0x42700000    # 60.0f

    .line 1898
    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeedRandom(F)V

    const v14, 0x3e4ccccd    # 0.2f

    .line 1899
    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setTrailLength(F)V

    .line 1970
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 1972
    new-instance v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 1974
    new-instance v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    invoke-virtual {v14, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    move-result-object v14

    invoke-virtual {v14, v6, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v14

    invoke-virtual {v14, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v14

    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 1975
    invoke-virtual {v2, v9, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    const v14, 0x3eca3d71    # 0.395f

    .line 1976
    invoke-virtual {v2, v14, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    .line 1977
    new-instance v15, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v5, 0x3e19999a    # 0.15f

    invoke-direct {v15, v11, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v2, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    const v15, 0x3c23d70a    # 0.01f

    .line 1978
    invoke-virtual {v2, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    const/high16 v7, 0x40600000    # 3.5f

    .line 1979
    invoke-virtual {v2, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    .line 1980
    invoke-virtual {v2, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setReactionDelay(I)V

    .line 1981
    invoke-virtual {v2, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setReactionAccumulatedDelay(I)V

    const/4 v3, 0x7

    .line 1982
    invoke-virtual {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 1984
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 1986
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 1987
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    move-result-object v6

    const/16 v10, -0x6000

    const v13, -0xcd00

    invoke-virtual {v6, v13, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v6

    invoke-virtual {v6, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 1989
    invoke-virtual {v3, v9, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    .line 1990
    invoke-virtual {v3, v14, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    .line 1991
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-direct {v6, v11, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 1992
    invoke-virtual {v3, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    .line 1993
    invoke-virtual {v3, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const/4 v6, 0x2

    .line 1995
    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setReactionAccumulatedDelay(I)V

    const/16 v6, 0xa

    .line 1996
    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 1998
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 2000
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {v6, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 2001
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    const/4 v10, 0x0

    invoke-virtual {v13, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    move-result-object v13

    const/high16 v10, -0x1000000

    invoke-virtual {v13, v10, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v13

    invoke-virtual {v13, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v10

    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 2003
    invoke-virtual {v6, v9, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    .line 2004
    invoke-virtual {v6, v14, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    .line 2005
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-direct {v10, v11, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 2006
    invoke-virtual {v6, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    .line 2007
    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const/4 v10, 0x4

    .line 2009
    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setReactionAccumulatedDelay(I)V

    const/16 v10, 0xd

    .line 2010
    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 2013
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 2015
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {v10, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 2016
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    const/4 v7, 0x0

    invoke-virtual {v13, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    move-result-object v13

    const v7, -0xfd00

    const/16 v15, -0x8000

    const/16 v5, -0x6000

    invoke-virtual {v13, v7, v15, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v5

    invoke-virtual {v5, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v5

    invoke-virtual {v10, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 2018
    invoke-virtual {v10, v9, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    .line 2019
    invoke-virtual {v10, v14, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    .line 2020
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v7, 0x3e19999a    # 0.15f

    invoke-direct {v5, v11, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v10, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    const v5, 0x3c23d70a    # 0.01f

    .line 2021
    invoke-virtual {v10, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    const/high16 v5, 0x40600000    # 3.5f

    .line 2022
    invoke-virtual {v10, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const/4 v5, 0x6

    .line 2024
    invoke-virtual {v10, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setReactionAccumulatedDelay(I)V

    const/16 v5, 0x10

    .line 2025
    invoke-virtual {v10, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 2028
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    const/4 v7, 0x1

    .line 2029
    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    const/high16 v7, -0x1000000

    .line 2031
    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    const/4 v7, 0x4

    .line 2032
    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    .line 2033
    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendModeContent(I)V

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v13, 0x0

    .line 2034
    invoke-virtual {v5, v13, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    .line 2036
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 2037
    invoke-virtual {v5, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 2038
    invoke-virtual {v5, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    .line 2040
    invoke-virtual {v5, v9, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    const v7, 0x3ecccccd    # 0.4f

    .line 2041
    invoke-virtual {v5, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const/4 v7, 0x1

    .line 2042
    invoke-virtual {v5, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 2043
    invoke-virtual {v5, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 2044
    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setCircleShape(Z)V

    .line 2046
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v9, 0x3e19999a    # 0.15f

    invoke-direct {v7, v11, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 2056
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2058
    invoke-virtual {v0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2061
    invoke-virtual {v0, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2062
    invoke-virtual {v0, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2063
    invoke-virtual {v0, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2064
    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2065
    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2068
    invoke-virtual {v0, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    const/4 v1, 0x1

    .line 2070
    invoke-static {v0, v12, v1}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    return-object v0
.end method

.method static createVisPreset15(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 16

    .line 2075
    invoke-static/range {p0 .. p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    .line 2077
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 2078
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v10, 0x2

    .line 2079
    invoke-virtual {v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/16 v3, 0x80

    const/high16 v4, 0x41c80000    # 25.0f

    const v5, 0x468ca000    # 18000.0f

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x0

    move-object v2, v9

    .line 2080
    invoke-virtual/range {v2 .. v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFFZIF)V

    const/4 v2, 0x4

    const/high16 v3, 0x3f800000    # 1.0f

    .line 2081
    invoke-virtual {v9, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setFftFilter(IF)V

    .line 2082
    invoke-virtual {v1, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 2084
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 2085
    invoke-virtual {v4, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const/high16 v5, -0x1000000

    .line 2086
    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    const/4 v5, 0x1

    .line 2087
    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    .line 2089
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;-><init>()V

    const/high16 v7, 0x3f000000    # 0.5f

    .line 2090
    invoke-virtual {v6, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPosition(FF)V

    .line 2091
    invoke-virtual {v6, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setScale(FF)V

    const/16 v8, 0x3e8

    .line 2092
    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesCountLimit(I)V

    const v8, 0x3d4ccccd    # 0.05f

    .line 2093
    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesSpawnTime(F)V

    .line 2094
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;-><init>()V

    invoke-virtual {v8, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;->setVectorRelativeToCenter(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    move-result-object v8

    const/4 v11, 0x0

    invoke-virtual {v8, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;->setVectorAngle(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    move-result-object v8

    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setArea(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)V

    .line 2095
    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setBlendMode(I)V

    .line 2096
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/VortexForceField;-><init>()V

    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setForceField(Lcom/daaw/avee/comp/Visualizer/Elements/Particles/IForceField;)V

    .line 2097
    sget-object v8, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->internalParticles:[Ljava/lang/String;

    aget-object v8, v8, v10

    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setCustomImage(Ljava/lang/String;)V

    .line 2099
    invoke-virtual {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getParticlesFactory()Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;

    move-result-object v8

    const/4 v12, -0x1

    .line 2100
    invoke-virtual {v8, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorTo(I)V

    const/4 v12, 0x0

    .line 2101
    invoke-virtual {v8, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorFrom(I)V

    const/high16 v13, 0x41000000    # 8.0f

    .line 2102
    invoke-virtual {v8, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setLifetime(F)V

    const v13, 0x3dcccccd    # 0.1f

    .line 2103
    invoke-virtual {v8, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInAndOutTime(F)V

    .line 2105
    invoke-virtual {v8, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setStartSize(F)V

    const/high16 v11, 0x40c00000    # 6.0f

    .line 2106
    invoke-virtual {v8, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInSize(F)V

    .line 2107
    invoke-virtual {v8, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSize(F)V

    const/high16 v11, 0x41800000    # 16.0f

    .line 2108
    invoke-virtual {v8, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSizeRandom(F)V

    const/high16 v11, -0x3c6a0000    # -300.0f

    .line 2109
    invoke-virtual {v8, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeed(F)V

    const/high16 v11, 0x41f00000    # 30.0f

    .line 2110
    invoke-virtual {v8, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeedRandom(F)V

    .line 2111
    invoke-virtual {v8, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setTrailLength(F)V

    .line 2187
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 2188
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    invoke-direct {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;-><init>()V

    const/4 v13, 0x3

    invoke-virtual {v11, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setSides(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    move-result-object v11

    const/high16 v14, 0x3fc00000    # 1.5f

    invoke-virtual {v11, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setRadius(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    move-result-object v11

    invoke-virtual {v8, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 2189
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    const/high16 v15, 0x40800000    # 4.0f

    invoke-virtual {v11, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setFixedLineHeight(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v11

    const v12, 0x473700ff

    const v5, 0x405500ff

    invoke-virtual {v11, v12, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setColor(II)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v5

    const v11, 0x3ecccccd    # 0.4f

    invoke-virtual {v5, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v5

    invoke-virtual {v8, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 2190
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    const/high16 v12, -0x3f800000    # -4.0f

    invoke-virtual {v5, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setFixedLineHeight(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v5

    const v10, 0x48005dff

    const v12, 0x610099ff

    invoke-virtual {v5, v10, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setColor(II)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v5

    const v10, -0x41333333    # -0.4f

    invoke-virtual {v5, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v5

    invoke-virtual {v8, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer2(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 2191
    invoke-virtual {v8, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    const v5, 0x3e4ccccd    # 0.2f

    .line 2192
    invoke-virtual {v8, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    const v5, 0x3ba3d70a    # 0.005f

    .line 2193
    invoke-virtual {v8, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    .line 2194
    invoke-virtual {v8, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const/4 v12, 0x6

    .line 2195
    invoke-virtual {v8, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setReactionDelay(I)V

    .line 2196
    invoke-virtual {v8, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 2198
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v12}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 2199
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;-><init>()V

    invoke-virtual {v2, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setSides(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    move-result-object v2

    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setRadius(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    move-result-object v2

    invoke-virtual {v12, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 2200
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    invoke-virtual {v2, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setFixedLineHeight(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v2

    const v15, 0x7f2200ff

    const v14, 0x7f6a00ff

    invoke-virtual {v2, v15, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setColor(II)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v2

    invoke-virtual {v2, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v2

    invoke-virtual {v12, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 2201
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    const/high16 v14, -0x3f800000    # -4.0f

    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setFixedLineHeight(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v2

    const v14, 0x7f007fff

    const v15, 0x7f00edff

    invoke-virtual {v2, v14, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setColor(II)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v2

    invoke-virtual {v2, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v2

    invoke-virtual {v12, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer2(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 2202
    invoke-virtual {v12, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    const v2, 0x3e99999a    # 0.3f

    .line 2203
    invoke-virtual {v12, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    .line 2204
    invoke-virtual {v12, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    .line 2205
    invoke-virtual {v12, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const/4 v2, 0x4

    .line 2206
    invoke-virtual {v12, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setReactionDelay(I)V

    .line 2207
    invoke-virtual {v12, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 2209
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 2210
    new-instance v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    invoke-direct {v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;-><init>()V

    invoke-virtual {v14, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setSides(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    move-result-object v14

    const/high16 v15, 0x3fc00000    # 1.5f

    invoke-virtual {v14, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setRadius(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    move-result-object v14

    invoke-virtual {v2, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 2211
    new-instance v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    const/high16 v15, 0x40800000    # 4.0f

    invoke-virtual {v14, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setFixedLineHeight(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v14

    const v15, -0x5049ff01

    const v13, -0x50bcff01

    invoke-virtual {v14, v15, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setColor(II)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v13

    invoke-virtual {v13, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v13

    invoke-virtual {v2, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 2212
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    const/high16 v14, -0x3f800000    # -4.0f

    invoke-virtual {v13, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setFixedLineHeight(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v13

    const v14, -0x50ff5e01

    const v15, -0x50ff4401

    invoke-virtual {v13, v14, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setColor(II)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v13

    invoke-virtual {v13, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v13

    invoke-virtual {v2, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer2(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 2213
    invoke-virtual {v2, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    .line 2214
    invoke-virtual {v2, v11, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    .line 2215
    invoke-virtual {v2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    .line 2216
    invoke-virtual {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const/4 v13, 0x2

    .line 2217
    invoke-virtual {v2, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setReactionDelay(I)V

    const/4 v13, 0x4

    .line 2218
    invoke-virtual {v2, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 2220
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 2221
    new-instance v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    invoke-direct {v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;-><init>()V

    const/4 v15, 0x3

    invoke-virtual {v14, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setSides(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    move-result-object v14

    const/high16 v15, 0x3fc00000    # 1.5f

    invoke-virtual {v14, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setRadius(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    move-result-object v14

    invoke-virtual {v13, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 2222
    new-instance v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    const/high16 v15, 0x40800000    # 4.0f

    invoke-virtual {v14, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setFixedLineHeight(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v14

    const v15, -0x6fff01

    const v3, -0xdff01

    invoke-virtual {v14, v15, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setColor(II)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v3

    invoke-virtual {v3, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v3

    invoke-virtual {v13, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 2223
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    const/high16 v11, -0x3f800000    # -4.0f

    invoke-virtual {v3, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setFixedLineHeight(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v3

    const v11, -0xff3401

    const v14, -0xffaf01

    invoke-virtual {v3, v11, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setColor(II)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v3

    invoke-virtual {v3, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v3

    invoke-virtual {v13, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer2(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 2224
    invoke-virtual {v13, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    .line 2225
    invoke-virtual {v13, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    .line 2226
    invoke-virtual {v13, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    const/high16 v3, 0x3f800000    # 1.0f

    .line 2227
    invoke-virtual {v13, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const/4 v5, 0x4

    .line 2228
    invoke-virtual {v13, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 2240
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    const/4 v7, 0x1

    .line 2241
    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    const v10, -0xebff0c

    .line 2242
    invoke-virtual {v5, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    const/4 v10, 0x2

    .line 2243
    invoke-virtual {v5, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    const/4 v10, 0x0

    .line 2244
    invoke-virtual {v5, v10, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    .line 2245
    invoke-virtual {v5, v7, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    .line 2247
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>()V

    .line 2248
    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    .line 2249
    invoke-virtual {v3, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2250
    invoke-virtual {v3, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2251
    invoke-virtual {v3, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2252
    invoke-virtual {v3, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2253
    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2256
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2257
    invoke-virtual {v0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2258
    invoke-virtual {v0, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    const/4 v1, 0x1

    .line 2261
    invoke-static {v0, v9, v1}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    return-object v0
.end method

.method static createVisPreset16(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 16

    .line 2267
    invoke-static/range {p0 .. p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    .line 2269
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 2270
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v13, 0x2

    .line 2271
    invoke-virtual {v12, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/16 v2, 0xb

    .line 2272
    invoke-virtual {v12, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleInCountPower(I)V

    const/16 v3, 0xe6

    const/high16 v4, 0x41700000    # 15.0f

    const v5, 0x469c4000    # 20000.0f

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v2, v12

    .line 2273
    invoke-virtual/range {v2 .. v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFFZIFIIF)V

    const/high16 v2, 0x428c0000    # 70.0f

    .line 2275
    invoke-virtual {v12, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSteadySmooth(F)V

    const/4 v2, 0x1

    const v3, 0x3ecccccd    # 0.4f

    .line 2278
    invoke-virtual {v12, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setFftFilter(IF)V

    const v3, 0x3f333333    # 0.7f

    const/4 v4, 0x0

    const/high16 v5, 0x3e800000    # 0.25f

    const/high16 v6, 0x42b40000    # 90.0f

    .line 2279
    invoke-virtual {v12, v4, v5, v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setBeatRangeCorners(FFFF)V

    const/high16 v4, 0x3f800000    # 1.0f

    .line 2280
    invoke-virtual {v12, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setAweightFft(F)V

    .line 2281
    invoke-virtual {v1, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 2284
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 2285
    invoke-virtual {v5, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const v6, 0x3f8ccccd    # 1.1f

    .line 2286
    invoke-virtual {v5, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const/4 v7, -0x1

    .line 2287
    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    const/4 v8, 0x0

    .line 2288
    invoke-virtual {v5, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 2290
    invoke-virtual {v5, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    .line 2293
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 2294
    invoke-virtual {v9, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlendMode(I)V

    .line 2295
    invoke-virtual {v9, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 2296
    invoke-virtual {v9, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const/high16 v6, -0x1000000

    .line 2297
    invoke-virtual {v9, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    const v10, -0x7f7f80

    .line 2298
    invoke-virtual {v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColorTo(I)V

    const/4 v10, 0x6

    const/4 v11, 0x5

    .line 2299
    invoke-virtual {v9, v2, v10, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(ZII)V

    .line 2300
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const-string v11, "Beat"

    invoke-direct {v10, v11, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setMeasureColor(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 2302
    invoke-virtual {v9, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    .line 2381
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 2382
    invoke-virtual {v10, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 2383
    invoke-virtual {v10, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    const/high16 v14, 0x3f000000    # 0.5f

    .line 2385
    invoke-virtual {v10, v14, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    const/high16 v15, 0x3f400000    # 0.75f

    .line 2386
    invoke-virtual {v10, v15, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 2387
    invoke-virtual {v10, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 2388
    invoke-virtual {v10, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 2390
    new-instance v15, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v4, 0x3c23d70a    # 0.01f

    invoke-direct {v15, v11, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v10, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 2391
    invoke-virtual {v10, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setGeneratedAlbumArtColor(I)V

    .line 2392
    invoke-virtual {v10, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    const-string v4, "internalres:particle_circle_blur4"

    .line 2393
    invoke-virtual {v10, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setCustomImage(Ljava/lang/String;)V

    .line 2395
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 2397
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {v4, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 2398
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    invoke-direct {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;-><init>()V

    invoke-virtual {v11, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    move-result-object v3

    invoke-virtual {v3, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    move-result-object v3

    invoke-virtual {v3, v7, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v3

    invoke-virtual {v4, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 2400
    invoke-virtual {v4, v14, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    const v3, 0x3f19999a    # 0.6f

    .line 2401
    invoke-virtual {v4, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    const v7, -0x44bb645a    # -0.003f

    .line 2403
    invoke-virtual {v4, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    const/high16 v7, -0x3f800000    # -4.0f

    .line 2404
    invoke-virtual {v4, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    .line 2406
    invoke-virtual {v4, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 2408
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    .line 2409
    invoke-virtual {v7, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    .line 2411
    invoke-virtual {v7, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    .line 2412
    invoke-virtual {v7, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    const/high16 v11, 0x3f800000    # 1.0f

    .line 2413
    invoke-virtual {v7, v8, v11, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    .line 2415
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 2416
    invoke-virtual {v11, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 2417
    invoke-virtual {v11, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    .line 2419
    invoke-virtual {v11, v14, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    .line 2420
    invoke-virtual {v11, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 2421
    invoke-virtual {v11, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 2422
    invoke-virtual {v11, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 2423
    invoke-virtual {v11, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setCircleShape(Z)V

    .line 2425
    invoke-virtual {v11, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setGeneratedAlbumArtColor(I)V

    .line 2430
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2431
    invoke-virtual {v0, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2432
    invoke-virtual {v0, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2433
    invoke-virtual {v0, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2434
    invoke-virtual {v0, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2435
    invoke-virtual {v0, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2436
    invoke-virtual {v0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2439
    invoke-static {v0, v12, v2}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    return-object v0
.end method

.method static createVisPreset17(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 16

    .line 2447
    invoke-static/range {p0 .. p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    .line 2449
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 2450
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v3, 0x2

    .line 2451
    invoke-virtual {v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/16 v4, 0xb

    .line 2452
    invoke-virtual {v2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleInCountPower(I)V

    const v4, 0x3e99999a    # 0.3f

    .line 2456
    invoke-virtual {v2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setAweightFft(F)V

    .line 2457
    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 2460
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    const/4 v6, 0x0

    .line 2461
    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    const/4 v7, 0x4

    .line 2462
    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendModeContent(I)V

    const/4 v7, 0x1

    .line 2463
    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentUnder(Z)V

    const/high16 v8, -0x1000000

    .line 2464
    invoke-virtual {v5, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    const/high16 v8, 0x3f800000    # 1.0f

    .line 2465
    invoke-virtual {v5, v6, v8, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    .line 2466
    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setReferenceComposition(I)V

    .line 2467
    invoke-static {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->makeIndexStringPath(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setMaskCustomImage(Ljava/lang/String;)V

    const v9, 0x404ccccd    # 3.2f

    .line 2468
    invoke-virtual {v5, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurMultiplier(F)V

    .line 2470
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 2471
    invoke-virtual {v9, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 2472
    invoke-virtual {v9, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    const/high16 v10, 0x3f000000    # 0.5f

    .line 2473
    invoke-virtual {v9, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    const v11, 0x3ecccccd    # 0.4f

    .line 2474
    invoke-virtual {v9, v11, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 2475
    invoke-virtual {v9, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 2476
    invoke-virtual {v9, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 2477
    invoke-virtual {v9, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setCircleShape(Z)V

    .line 2478
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v13, 0x3f333333    # 0.7f

    const-string v14, "ConstantShake"

    invoke-direct {v12, v14, v13, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v9, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setMeasurePos(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 2483
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v12}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const v15, 0x3f8ccccd    # 1.1f

    .line 2484
    invoke-virtual {v12, v15, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 2485
    invoke-virtual {v12, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    .line 2486
    invoke-virtual {v12, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 2487
    invoke-virtual {v12, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setKeepAspectRatioAndCropToFit(Z)V

    .line 2488
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-direct {v8, v14, v4, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v12, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setMeasurePos(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 2492
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 2493
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {v4, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 2494
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;-><init>()V

    const v15, 0x3f666666    # 0.9f

    invoke-virtual {v8, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;

    move-result-object v8

    const v15, -0xffff01

    const v6, -0xff60

    invoke-virtual {v8, v15, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->setColor(II)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v6

    invoke-virtual {v6, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 2495
    invoke-virtual {v4, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    .line 2496
    invoke-virtual {v4, v11, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    const/high16 v6, 0x40a00000    # 5.0f

    .line 2497
    invoke-virtual {v4, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const/4 v6, 0x0

    .line 2498
    invoke-virtual {v4, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    .line 2499
    invoke-virtual {v4, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 2500
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-direct {v8, v14, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v4, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMeasurePos(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 2505
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;-><init>()V

    .line 2506
    invoke-virtual {v8, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPosition(FF)V

    .line 2507
    invoke-virtual {v8, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setScale(FF)V

    .line 2508
    invoke-virtual {v8, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setScaleUniform(Z)V

    const/16 v11, 0x3e8

    .line 2509
    invoke-virtual {v8, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesCountLimit(I)V

    const v11, 0x3cf5c28f    # 0.03f

    .line 2510
    invoke-virtual {v8, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesSpawnTime(F)V

    .line 2511
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    invoke-direct {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;-><init>()V

    invoke-virtual {v11, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;->setUseRandomVectorInstead(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    move-result-object v11

    invoke-virtual {v8, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setArea(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)V

    .line 2512
    invoke-virtual {v8, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setBlendMode(I)V

    .line 2513
    sget-object v11, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->internalParticles:[Ljava/lang/String;

    aget-object v3, v11, v3

    invoke-virtual {v8, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setCustomImage(Ljava/lang/String;)V

    const/high16 v3, 0x40000000    # 2.0f

    .line 2514
    invoke-virtual {v8, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesScale(F)V

    .line 2515
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const-string v15, "Beat"

    const/high16 v6, 0x3f400000    # 0.75f

    invoke-direct {v11, v15, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v8, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setMeasureOverallSpeed(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 2516
    invoke-virtual {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getParticlesFactory()Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;

    move-result-object v6

    const/4 v11, -0x1

    .line 2518
    invoke-virtual {v6, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorBoth(I)V

    const/high16 v11, 0x40600000    # 3.5f

    .line 2519
    invoke-virtual {v6, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setLifetime(F)V

    const v11, 0x3eb33333    # 0.35f

    .line 2520
    invoke-virtual {v6, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInAndOutTime(F)V

    const/high16 v11, 0x40e00000    # 7.0f

    .line 2521
    invoke-virtual {v6, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setStartSize(F)V

    const/high16 v11, 0x40400000    # 3.0f

    .line 2522
    invoke-virtual {v6, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInSize(F)V

    .line 2523
    invoke-virtual {v6, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSize(F)V

    const/high16 v3, 0x41800000    # 16.0f

    .line 2524
    invoke-virtual {v6, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSizeRandom(F)V

    const/high16 v3, 0x41f00000    # 30.0f

    .line 2525
    invoke-virtual {v6, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeed(F)V

    .line 2526
    invoke-virtual {v6, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeedRandom(F)V

    .line 2528
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/4 v6, 0x0

    .line 2529
    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 2530
    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    .line 2531
    invoke-virtual {v3, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    const v6, 0x3f051eb8    # 0.52f

    .line 2532
    invoke-virtual {v3, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 2533
    invoke-virtual {v3, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 2534
    invoke-virtual {v3, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 2535
    invoke-virtual {v3, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setCircleShape(Z)V

    .line 2536
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-direct {v6, v14, v13, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setMeasurePos(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 2540
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/4 v11, 0x0

    .line 2541
    invoke-virtual {v6, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 2542
    invoke-virtual {v6, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    const/4 v15, 0x0

    .line 2543
    invoke-virtual {v6, v10, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    const v15, 0x3e4ccccd    # 0.2f

    .line 2544
    invoke-virtual {v6, v10, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPosition(FF)V

    const v15, 0x3dcccccd    # 0.1f

    const v10, 0x3f8ccccd    # 1.1f

    .line 2545
    invoke-virtual {v6, v10, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 2546
    invoke-virtual {v6, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setKeepAspectRatio(Z)V

    .line 2547
    invoke-virtual {v6, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 2548
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/high16 v7, 0x3f000000    # 0.5f

    invoke-direct {v10, v14, v13, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setMeasurePos(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 2550
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 2551
    invoke-virtual {v10, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 2552
    invoke-virtual {v10, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    const/high16 v13, 0x3f800000    # 1.0f

    .line 2553
    invoke-virtual {v10, v7, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    const v13, 0x3f4ccccd    # 0.8f

    .line 2554
    invoke-virtual {v10, v7, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPosition(FF)V

    const v13, 0x3f8ccccd    # 1.1f

    .line 2555
    invoke-virtual {v10, v13, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 2556
    invoke-virtual {v10, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setKeepAspectRatio(Z)V

    const/4 v11, 0x1

    .line 2557
    invoke-virtual {v10, v11, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 2558
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v13, 0x3f333333    # 0.7f

    invoke-direct {v11, v14, v13, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v10, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setMeasurePos(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 2561
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>()V

    .line 2562
    invoke-virtual {v0, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    .line 2563
    invoke-virtual {v7, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2564
    invoke-virtual {v7, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2566
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>()V

    .line 2567
    invoke-virtual {v0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    .line 2568
    invoke-virtual {v4, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2569
    invoke-virtual {v4, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2570
    invoke-virtual {v4, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2571
    invoke-virtual {v4, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2573
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2574
    invoke-virtual {v0, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2575
    invoke-virtual {v0, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    const/4 v1, 0x1

    .line 2577
    invoke-static {v0, v2, v1}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    return-object v0
.end method

.method static createVisPreset18(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 15

    .line 2583
    invoke-static {p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    .line 2585
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 2586
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v12, 0x2

    .line 2587
    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/16 v1, 0xb

    .line 2588
    invoke-virtual {v11, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleInCountPower(I)V

    const/16 v2, 0xe6

    const/high16 v3, 0x41700000    # 15.0f

    const v4, 0x44898000    # 1100.0f

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/high16 v7, 0x3f800000    # 1.0f

    const/16 v8, 0xf

    const/16 v9, 0xf

    const v10, 0x3ecccccd    # 0.4f

    move-object v1, v11

    .line 2589
    invoke-virtual/range {v1 .. v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFFZIFIIF)V

    const/high16 v1, 0x428c0000    # 70.0f

    .line 2591
    invoke-virtual {v11, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSteadySmooth(F)V

    const/high16 v1, 0x40000000    # 2.0f

    const/4 v2, 0x3

    .line 2594
    invoke-virtual {v11, v2, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setFftFilter(IF)V

    const/4 v2, 0x0

    const/high16 v3, 0x3e800000    # 0.25f

    const v4, 0x3f333333    # 0.7f

    const/high16 v5, 0x420c0000    # 35.0f

    .line 2595
    invoke-virtual {v11, v2, v3, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setBeatRangeCorners(FFFF)V

    .line 2596
    invoke-virtual {v0, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 2598
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/high16 v3, 0x3f800000    # 1.0f

    .line 2599
    invoke-virtual {v2, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const v4, 0x3f8ccccd    # 1.1f

    .line 2600
    invoke-virtual {v2, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const/4 v4, -0x1

    .line 2601
    invoke-virtual {v2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    const/4 v4, 0x0

    .line 2602
    invoke-virtual {v2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    const/4 v5, 0x1

    .line 2604
    invoke-virtual {v2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    .line 2685
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 2686
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v8, 0x3e99999a    # 0.3f

    const-string v9, "BeatRandomShake"

    invoke-direct {v7, v9, v8, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMeasurePos(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 2687
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 2688
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;-><init>()V

    invoke-virtual {v7, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    move-result-object v1

    const/high16 v7, -0x1000000

    invoke-virtual {v1, v7, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v1

    invoke-virtual {v6, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    const/high16 v1, 0x3f000000    # 0.5f

    .line 2690
    invoke-virtual {v6, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    const v10, 0x3eca3d71    # 0.395f

    .line 2691
    invoke-virtual {v6, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    .line 2692
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v13, 0x3e19999a    # 0.15f

    const-string v14, "Beat"

    invoke-direct {v10, v14, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    const v10, 0x3c23d70a    # 0.01f

    .line 2693
    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    const/high16 v10, 0x40400000    # 3.0f

    .line 2694
    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const v10, 0x3e2aaaab

    .line 2695
    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setRot(F)V

    const/16 v10, 0xa

    .line 2696
    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 2698
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v10}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    .line 2699
    invoke-virtual {v10, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    .line 2701
    invoke-virtual {v10, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    .line 2702
    invoke-virtual {v10, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    .line 2703
    invoke-virtual {v10, v4, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    .line 2705
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v12}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 2706
    invoke-virtual {v12, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 2707
    invoke-virtual {v12, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    .line 2708
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-direct {v4, v9, v8, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v12, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setMeasurePos(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 2709
    invoke-virtual {v12, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    const v1, 0x3ecccccd    # 0.4f

    .line 2710
    invoke-virtual {v12, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 2711
    invoke-virtual {v12, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 2712
    invoke-virtual {v12, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 2713
    invoke-virtual {v12, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setCircleShape(Z)V

    .line 2714
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-direct {v1, v14, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v12, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 2715
    invoke-virtual {v12, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setGeneratedAlbumArtColor(I)V

    .line 2720
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2721
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2722
    invoke-virtual {p0, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2723
    invoke-virtual {p0, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2724
    invoke-virtual {p0, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 2726
    invoke-static {p0, v11, v5}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    return-object p0
.end method

.method static createVisPreset2(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 13

    .line 583
    invoke-static {p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    .line 585
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 586
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v2, 0x1

    .line 587
    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/4 v3, 0x0

    const/16 v4, 0xa0

    const v5, 0x3e4ccccd    # 0.2f

    .line 588
    invoke-virtual {v1, v4, v5, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFI)V

    const/16 v4, 0xb

    .line 589
    invoke-virtual {v1, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleInCountPower(I)V

    const v4, 0x3f19999a    # 0.6f

    .line 590
    invoke-virtual {v1, v2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setFftFilter(IF)V

    .line 592
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 594
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/high16 v5, 0x3f800000    # 1.0f

    .line 595
    invoke-virtual {v4, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 596
    invoke-virtual {v4, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    .line 598
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 599
    invoke-virtual {v6, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    const/high16 v7, 0x3f000000    # 0.5f

    .line 600
    invoke-virtual {v6, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    const v8, -0x41666666    # -0.3f

    .line 601
    invoke-virtual {v6, v7, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPosition(FF)V

    const v8, 0x3eb33333    # 0.35f

    .line 602
    invoke-virtual {v6, v8, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 603
    invoke-virtual {v6, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 604
    invoke-virtual {v6, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 606
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;-><init>()V

    .line 607
    sget v9, Lcom/daaw/avee/Design/VisualizerThemes;->color1:I

    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setColor(I)V

    .line 608
    sget v9, Lcom/daaw/avee/Design/VisualizerThemes;->textBlendMode:I

    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setBlendMode(I)V

    const/16 v9, 0x38

    .line 609
    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setFontSize(I)V

    const-string v9, "{Artist}"

    .line 610
    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setText(Ljava/lang/String;)V

    .line 611
    invoke-virtual {v8, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setPosition(FF)V

    const v9, 0x3fb33333    # 1.4f

    .line 612
    invoke-virtual {v8, v7, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setLocalPosition(FF)V

    .line 614
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;

    invoke-direct {v10}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;-><init>()V

    .line 615
    sget v11, Lcom/daaw/avee/Design/VisualizerThemes;->color1:I

    invoke-virtual {v10, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setColor(I)V

    .line 616
    sget v11, Lcom/daaw/avee/Design/VisualizerThemes;->textBlendMode:I

    invoke-virtual {v10, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setBlendMode(I)V

    const/16 v11, 0x1c

    .line 617
    invoke-virtual {v10, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setFontSize(I)V

    const-string v11, "{Title}"

    .line 618
    invoke-virtual {v10, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setText(Ljava/lang/String;)V

    .line 619
    invoke-virtual {v10, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setPosition(FF)V

    .line 620
    invoke-virtual {v10, v7, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setLocalPosition(FF)V

    .line 622
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;-><init>()V

    .line 623
    invoke-virtual {v9, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPosition(FF)V

    .line 624
    invoke-virtual {v9, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setScale(FF)V

    const/16 v11, 0x3e8

    .line 625
    invoke-virtual {v9, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesCountLimit(I)V

    const v11, 0x3d4ccccd    # 0.05f

    .line 626
    invoke-virtual {v9, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesSpawnTime(F)V

    .line 627
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;

    invoke-direct {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;-><init>()V

    const/high16 v12, 0x43870000    # 270.0f

    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->setVectorAngle(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;

    move-result-object v11

    invoke-virtual {v11, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;->setUseRandomVectorInstead(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaHorizontalLine;

    move-result-object v3

    invoke-virtual {v9, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setArea(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)V

    const/4 v3, 0x2

    .line 628
    invoke-virtual {v9, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setBlendMode(I)V

    .line 630
    invoke-virtual {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getParticlesFactory()Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;

    move-result-object v11

    const v12, 0x3f333333    # 0.7f

    .line 632
    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setLifetime(F)V

    const v12, 0x3e99999a    # 0.3f

    .line 633
    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInAndOutTime(F)V

    const/high16 v12, 0x41200000    # 10.0f

    .line 634
    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setStartSize(F)V

    .line 635
    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInSize(F)V

    .line 636
    invoke-virtual {v11, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSize(F)V

    const/high16 v12, 0x40c00000    # 6.0f

    .line 637
    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSizeRandom(F)V

    const v12, -0x33333334

    .line 638
    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorBoth(I)V

    const/high16 v12, 0x42480000    # 50.0f

    .line 639
    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeed(F)V

    .line 640
    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeedRandom(F)V

    .line 695
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 696
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathHorizontalLine;

    invoke-direct {v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathHorizontalLine;-><init>()V

    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 697
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    invoke-direct {v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;-><init>()V

    invoke-virtual {v11, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 698
    invoke-virtual {v11, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    const/high16 v7, -0x40800000    # -1.0f

    .line 699
    invoke-virtual {v11, v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    const v5, 0x3b449ba6    # 0.003f

    .line 700
    invoke-virtual {v11, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    .line 702
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    .line 703
    invoke-virtual {v5, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    .line 704
    invoke-virtual {v5, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    .line 706
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>()V

    .line 707
    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    .line 708
    invoke-virtual {v3, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 709
    invoke-virtual {v3, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 711
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 712
    invoke-virtual {p0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 713
    invoke-virtual {p0, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 714
    invoke-virtual {p0, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 715
    invoke-virtual {p0, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 716
    invoke-virtual {p0, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 718
    invoke-static {p0, v1, v2}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    return-object p0
.end method

.method static createVisPreset3(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 13

    .line 724
    invoke-static {p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    .line 726
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 727
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/16 v2, 0xa0

    const/high16 v3, 0x41a00000    # 20.0f

    const v4, 0x468ca000    # 18000.0f

    const/4 v5, 0x0

    const/4 v6, 0x4

    const v7, 0x3e19999a    # 0.15f

    const/4 v8, 0x3

    const/4 v9, 0x3

    const/4 v10, 0x0

    move-object v1, v11

    .line 728
    invoke-virtual/range {v1 .. v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFFZIFIIF)V

    const/16 v1, 0xb

    .line 729
    invoke-virtual {v11, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleInCountPower(I)V

    .line 732
    invoke-virtual {v0, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 735
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/4 v2, 0x0

    .line 736
    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    const v3, 0x3f8ccccd    # 1.1f

    .line 737
    invoke-virtual {v1, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const/4 v3, 0x1

    .line 738
    invoke-virtual {v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    const/high16 v4, -0x1000000

    .line 739
    invoke-virtual {v1, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setGeneratedAlbumArtColor(I)V

    .line 740
    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlendMode(I)V

    .line 742
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v6, 0x3e4ccccd    # 0.2f

    const-string v7, "ConstantShake"

    const v8, 0x3f19999a    # 0.6f

    invoke-direct {v5, v7, v8, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v1, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setMeasurePos(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 743
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const-string v7, "ConstantShakeRotLess"

    const/high16 v8, 0x3e800000    # 0.25f

    invoke-direct {v5, v7, v8, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v1, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setMeasureRot(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 752
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 753
    invoke-virtual {v5, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 754
    invoke-virtual {v5, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    const/high16 v6, 0x3f000000    # 0.5f

    .line 755
    invoke-virtual {v5, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    const v7, 0x3ecccccd    # 0.4f

    .line 756
    invoke-virtual {v5, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 757
    invoke-virtual {v5, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 758
    invoke-virtual {v5, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 769
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 770
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;-><init>()V

    const/4 v10, 0x4

    invoke-virtual {v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setSides(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    move-result-object v9

    const v10, 0x3fb76c8b    # 1.433f

    invoke-virtual {v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setRadius(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 771
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;-><init>()V

    const v10, 0x3f4ccccd    # 0.8f

    invoke-virtual {v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;

    move-result-object v9

    invoke-virtual {v9, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;

    move-result-object v9

    const/high16 v12, -0x10000

    invoke-virtual {v9, v12, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->setColor(II)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v9

    const v12, 0x3fcccccd    # 1.6f

    invoke-virtual {v9, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 772
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;-><init>()V

    invoke-virtual {v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;

    move-result-object v9

    invoke-virtual {v9, v4, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer2(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 773
    invoke-virtual {v8, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBlendMode(I)V

    const/high16 v9, 0x3e000000    # 0.125f

    .line 774
    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setRot(F)V

    .line 775
    invoke-virtual {v8, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    .line 776
    invoke-virtual {v8, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    const/high16 v6, 0x40000000    # 2.0f

    .line 777
    invoke-virtual {v8, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const v6, 0x3bc49ba6    # 0.006f

    .line 778
    invoke-virtual {v8, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    .line 780
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    .line 781
    invoke-virtual {v6, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    .line 782
    invoke-virtual {v6, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    .line 783
    invoke-virtual {v6, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendModeContent(I)V

    .line 784
    invoke-virtual {v6, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    .line 786
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>()V

    .line 787
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    .line 788
    invoke-virtual {v2, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 791
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 792
    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 793
    invoke-virtual {p0, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 794
    invoke-virtual {p0, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 798
    invoke-static {p0, v11, v3}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    return-object p0
.end method

.method static createVisPreset4(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 11

    .line 803
    invoke-static {p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    .line 805
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 806
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v2, 0x2

    .line 807
    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/high16 v3, 0x3f000000    # 0.5f

    .line 809
    invoke-virtual {v1, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setAweightFft(F)V

    .line 810
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 812
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/high16 v5, 0x3f800000    # 1.0f

    .line 813
    invoke-virtual {v4, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const/4 v5, 0x1

    .line 814
    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    .line 818
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 819
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 820
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;-><init>()V

    const v8, 0x3f666666    # 0.9f

    invoke-virtual {v7, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;->setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererRoundBar;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 821
    invoke-virtual {v6, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    const v7, 0x3ecccccd    # 0.4f

    .line 822
    invoke-virtual {v6, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    const/high16 v8, 0x40800000    # 4.0f

    .line 823
    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const/4 v8, 0x0

    .line 824
    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    const/4 v9, 0x3

    .line 825
    invoke-virtual {v6, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 827
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    .line 828
    invoke-virtual {v9, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    const/4 v10, 0x0

    .line 829
    invoke-virtual {v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    .line 830
    invoke-virtual {v9, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    .line 831
    invoke-virtual {v9, v10, v8, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    const v2, 0x3ff33333    # 1.9f

    .line 832
    invoke-virtual {v9, v5, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    .line 834
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 835
    invoke-virtual {v2, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 836
    invoke-virtual {v2, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    .line 837
    invoke-virtual {v2, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    .line 838
    invoke-virtual {v2, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 839
    invoke-virtual {v2, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 840
    invoke-virtual {v2, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 841
    invoke-virtual {v2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setCircleShape(Z)V

    .line 843
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>()V

    .line 844
    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    .line 845
    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 847
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 848
    invoke-virtual {p0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 849
    invoke-virtual {p0, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 850
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 852
    invoke-static {p0, v1, v5}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    return-object p0
.end method

.method static createVisPreset5(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 11

    .line 857
    invoke-static {p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    .line 859
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 860
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/16 v2, 0x40

    const/high16 v3, 0x41a00000    # 20.0f

    const v4, 0x468ca000    # 18000.0f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x3e99999a    # 0.3f

    move-object v1, v8

    .line 861
    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFFZIF)V

    const/4 v1, 0x2

    .line 862
    invoke-virtual {v8, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    .line 863
    invoke-virtual {v8, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setAweightFft(F)V

    .line 864
    invoke-virtual {v8, v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setFftFilter(IF)V

    .line 866
    invoke-virtual {v0, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 868
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 869
    invoke-virtual {v3, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const v4, -0x4f4f50

    .line 870
    invoke-virtual {v3, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    const/4 v4, 0x1

    .line 871
    invoke-virtual {v3, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    .line 873
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 874
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 875
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;-><init>()V

    const/16 v7, -0x6cb6

    const v9, -0x7f006cb6

    invoke-virtual {v6, v7, v9, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    const/high16 v6, 0x3f000000    # 0.5f

    .line 876
    invoke-virtual {v5, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    const v7, 0x3ecccccd    # 0.4f

    .line 877
    invoke-virtual {v5, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    const v9, 0x3c23d70a    # 0.01f

    .line 878
    invoke-virtual {v5, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    const/high16 v9, 0x41000000    # 8.0f

    .line 879
    invoke-virtual {v5, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    .line 880
    invoke-virtual {v5, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 882
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    .line 883
    invoke-virtual {v9, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    const v10, -0x5ceff0

    .line 884
    invoke-virtual {v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    .line 885
    invoke-virtual {v9, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    const/4 v1, 0x0

    .line 886
    invoke-virtual {v9, v1, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    const v2, 0x3ff33333    # 1.9f

    .line 887
    invoke-virtual {v9, v4, v2, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    .line 890
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 891
    invoke-virtual {v2, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 892
    invoke-virtual {v2, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    .line 893
    invoke-virtual {v2, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    .line 894
    invoke-virtual {v2, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 895
    invoke-virtual {v2, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 896
    invoke-virtual {v2, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 897
    invoke-virtual {v2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setCircleShape(Z)V

    .line 899
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>()V

    .line 900
    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    .line 901
    invoke-virtual {v1, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 903
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 904
    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 905
    invoke-virtual {p0, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 906
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 908
    invoke-static {p0, v8, v4}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    return-object p0
.end method

.method static createVisPreset6(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 15

    .line 913
    invoke-static {p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    .line 915
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 916
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v9, 0x2

    .line 917
    invoke-virtual {v8, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/16 v1, 0xb

    .line 918
    invoke-virtual {v8, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleInCountPower(I)V

    const/16 v2, 0x96

    const/high16 v3, 0x41a00000    # 20.0f

    const v4, 0x468ca000    # 18000.0f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x3e19999a    # 0.15f

    move-object v1, v8

    .line 919
    invoke-virtual/range {v1 .. v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFFZIF)V

    const/high16 v1, 0x3f000000    # 0.5f

    .line 920
    invoke-virtual {v8, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setAweightFft(F)V

    .line 922
    invoke-virtual {v0, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 924
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/high16 v3, 0x3f800000    # 1.0f

    .line 925
    invoke-virtual {v2, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const v4, -0x4f4f50

    .line 926
    invoke-virtual {v2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    const/4 v4, 0x1

    .line 928
    invoke-virtual {v2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    .line 931
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;-><init>()V

    .line 932
    invoke-virtual {v5, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPosition(FF)V

    .line 933
    invoke-virtual {v5, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setScale(FF)V

    const/16 v6, 0x3e8

    .line 934
    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesCountLimit(I)V

    const v6, 0x3cf5c28f    # 0.03f

    .line 935
    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesSpawnTime(F)V

    .line 936
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;-><init>()V

    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setArea(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)V

    .line 937
    invoke-virtual {v5, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setBlendMode(I)V

    const/high16 v6, 0x44610000    # 900.0f

    .line 938
    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPerspectiveDepth(F)V

    const/high16 v6, 0x43160000    # 150.0f

    .line 939
    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPerspectiveFov(F)V

    .line 941
    invoke-virtual {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getParticlesFactory()Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;

    move-result-object v6

    const v7, -0x33333334

    .line 942
    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorBoth(I)V

    const/high16 v7, 0x41000000    # 8.0f

    .line 943
    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setLifetime(F)V

    const v10, 0x3dcccccd    # 0.1f

    .line 944
    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInAndOutTime(F)V

    const/high16 v10, 0x40800000    # 4.0f

    .line 945
    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setStartSize(F)V

    .line 946
    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInSize(F)V

    .line 947
    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSize(F)V

    .line 948
    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSizeRandom(F)V

    const/high16 v7, 0x42c80000    # 100.0f

    .line 949
    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeed(F)V

    const/high16 v7, 0x42700000    # 60.0f

    .line 950
    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeedRandom(F)V

    .line 1009
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 1010
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 1011
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    const/4 v11, 0x0

    invoke-virtual {v7, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    move-result-object v7

    const v12, -0xffff01

    const v13, -0xff0001

    invoke-virtual {v7, v12, v13, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setColor(III)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 1012
    invoke-virtual {v6, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    const v7, 0x3ecccccd    # 0.4f

    .line 1013
    invoke-virtual {v6, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    .line 1014
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v13, 0x3e19999a    # 0.15f

    const-string v14, "Beat"

    invoke-direct {v12, v14, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v6, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    const v12, 0x3c23d70a    # 0.01f

    .line 1015
    invoke-virtual {v6, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    .line 1016
    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const/4 v10, 0x3

    .line 1017
    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 1019
    new-instance v10, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v10}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    .line 1020
    invoke-virtual {v10, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    const v12, -0xe2c85b

    .line 1021
    invoke-virtual {v10, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    .line 1022
    invoke-virtual {v10, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    .line 1023
    invoke-virtual {v10, v11, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    .line 1025
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 1026
    invoke-virtual {v3, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 1027
    invoke-virtual {v3, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    .line 1028
    invoke-virtual {v3, v1, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    .line 1029
    invoke-virtual {v3, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 1030
    invoke-virtual {v3, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 1031
    invoke-virtual {v3, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 1032
    invoke-virtual {v3, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setCircleShape(Z)V

    .line 1033
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    invoke-direct {v1, v14, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v3, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 1035
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>()V

    .line 1036
    invoke-virtual {p0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    .line 1037
    invoke-virtual {v1, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1038
    invoke-virtual {v1, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1040
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1041
    invoke-virtual {p0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1042
    invoke-virtual {p0, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1043
    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1045
    invoke-static {p0, v8, v4}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    return-object p0
.end method

.method static createVisPreset7(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 16

    .line 1050
    invoke-static/range {p0 .. p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    .line 1052
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 1053
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v10, 0x2

    .line 1054
    invoke-virtual {v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/16 v3, 0x80

    const/high16 v4, 0x41c80000    # 25.0f

    const v5, 0x468ca000    # 18000.0f

    const/4 v6, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x0

    move-object v2, v9

    .line 1055
    invoke-virtual/range {v2 .. v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFFZIF)V

    .line 1056
    invoke-virtual {v1, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 1058
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const/high16 v3, 0x3f800000    # 1.0f

    .line 1059
    invoke-virtual {v2, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const v4, -0xbfbfc0

    .line 1060
    invoke-virtual {v2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    const/4 v4, 0x0

    .line 1061
    invoke-virtual {v2, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setKeepAspectRatio(Z)V

    const/4 v5, 0x1

    .line 1062
    invoke-virtual {v2, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    const/high16 v6, -0x1000000

    .line 1063
    invoke-virtual {v2, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setGeneratedAlbumArtColor(I)V

    .line 1066
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;-><init>()V

    const/4 v7, -0x1

    .line 1067
    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setColor(I)V

    const/high16 v7, 0x3f000000    # 0.5f

    .line 1068
    invoke-virtual {v6, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPosition(FF)V

    .line 1069
    invoke-virtual {v6, v3, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setScale(FF)V

    const/16 v8, 0x3e8

    .line 1070
    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesCountLimit(I)V

    const v8, 0x3d4ccccd    # 0.05f

    .line 1071
    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesSpawnTime(F)V

    const/high16 v11, 0x40a00000    # 5.0f

    .line 1072
    invoke-virtual {v6, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesScale(F)V

    .line 1073
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    invoke-direct {v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;-><init>()V

    invoke-virtual {v12, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;->setUseRandomVectorInstead(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    move-result-object v12

    invoke-virtual {v6, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setArea(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)V

    .line 1074
    invoke-virtual {v6, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setBlendMode(I)V

    .line 1075
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const-string v13, "Beat"

    invoke-direct {v12, v13, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v6, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setMeasureOverallSpeed(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 1076
    sget-object v8, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->internalParticles:[Ljava/lang/String;

    aget-object v8, v8, v10

    invoke-virtual {v6, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setCustomImage(Ljava/lang/String;)V

    .line 1078
    invoke-virtual {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getParticlesFactory()Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;

    move-result-object v8

    const/high16 v12, 0x3fc00000    # 1.5f

    .line 1080
    invoke-virtual {v8, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSideSineWaveFreq(F)V

    const/4 v13, 0x0

    .line 1081
    invoke-virtual {v8, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSideSineWaveFreqRandom(F)V

    const/high16 v14, 0x40600000    # 3.5f

    .line 1082
    invoke-virtual {v8, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSideSineWaveMag(F)V

    .line 1083
    invoke-virtual {v8, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSideSineWaveMagRandom(F)V

    const v14, -0xff6000

    .line 1085
    invoke-virtual {v8, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorFrom(I)V

    .line 1086
    invoke-virtual {v8, v7, v3, v13, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorTo(FFFF)V

    .line 1087
    invoke-virtual {v8, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setLifetime(F)V

    const v14, 0x3dcccccd    # 0.1f

    .line 1088
    invoke-virtual {v8, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInAndOutTime(F)V

    const/high16 v14, 0x40400000    # 3.0f

    .line 1090
    invoke-virtual {v8, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeed(F)V

    const/high16 v14, 0x41200000    # 10.0f

    .line 1091
    invoke-virtual {v8, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setStartSize(F)V

    const v14, 0x3f666666    # 0.9f

    .line 1092
    invoke-virtual {v8, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInSize(F)V

    .line 1093
    invoke-virtual {v8, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSize(F)V

    const/high16 v11, 0x40000000    # 2.0f

    .line 1094
    invoke-virtual {v8, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSizeRandom(F)V

    const/high16 v14, 0x41f00000    # 30.0f

    .line 1095
    invoke-virtual {v8, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeed(F)V

    .line 1096
    invoke-virtual {v8, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeedRandom(F)V

    .line 1161
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 1162
    invoke-virtual {v8, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 1163
    invoke-virtual {v8, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    .line 1164
    invoke-virtual {v8, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    .line 1165
    invoke-virtual {v8, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 1166
    invoke-virtual {v8, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 1167
    invoke-virtual {v8, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 1168
    invoke-virtual {v8, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setCircleShape(Z)V

    .line 1169
    new-instance v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    invoke-direct {v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;-><init>()V

    const/4 v15, 0x3

    invoke-virtual {v14, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setSides(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    move-result-object v14

    const v3, 0x3fb76c8b    # 1.433f

    invoke-virtual {v14, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setRadius(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    move-result-object v3

    invoke-virtual {v8, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 1171
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 1172
    new-instance v14, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    invoke-direct {v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;-><init>()V

    invoke-virtual {v14, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setSides(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    move-result-object v14

    invoke-virtual {v14, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;->setRadius(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathSided;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 1173
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;

    invoke-direct {v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;-><init>()V

    const v14, 0x3e99999a    # 0.3f

    invoke-virtual {v12, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;

    move-result-object v12

    invoke-virtual {v12, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererSharpBar;->setFixedLineHeight(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v12

    const v14, -0xff0100

    invoke-virtual {v12, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setColor(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 1174
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    invoke-direct {v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;-><init>()V

    const v14, 0x3f19999a    # 0.6f

    invoke-virtual {v12, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    move-result-object v12

    invoke-virtual {v12, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setBarHeightMultiplier(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v12

    const/high16 v13, -0x3f600000    # -5.0f

    invoke-virtual {v12, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setFixedLineHeight(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v12

    const v13, 0x4000ff00

    invoke-virtual {v12, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setColor(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v12

    invoke-virtual {v3, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer2(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 1175
    invoke-virtual {v3, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    .line 1176
    invoke-virtual {v3, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    const v7, 0x3ba3d70a    # 0.005f

    .line 1177
    invoke-virtual {v3, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    .line 1178
    invoke-virtual {v3, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    .line 1188
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    .line 1189
    invoke-virtual {v7, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    const v11, -0xff0060

    .line 1190
    invoke-virtual {v7, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    .line 1191
    invoke-virtual {v7, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    const/high16 v10, 0x3f800000    # 1.0f

    .line 1192
    invoke-virtual {v7, v4, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    .line 1194
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>()V

    .line 1195
    invoke-virtual {v0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    .line 1196
    invoke-virtual {v4, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1197
    invoke-virtual {v4, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1200
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1201
    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1202
    invoke-virtual {v0, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1203
    invoke-virtual {v0, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1205
    invoke-static {v0, v9, v5}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    return-object v0
.end method

.method static createVisPreset8(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 11

    .line 1211
    invoke-static {p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    .line 1213
    new-instance v0, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 1214
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v2, 0x1

    .line 1215
    invoke-virtual {v1, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/16 v3, 0xb4

    const/high16 v4, 0x3e800000    # 0.25f

    const/4 v5, 0x5

    .line 1216
    invoke-virtual {v1, v3, v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFI)V

    .line 1218
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 1220
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const v4, -0xff74

    .line 1221
    invoke-virtual {v3, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    const/high16 v4, 0x3f800000    # 1.0f

    .line 1222
    invoke-virtual {v3, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 1224
    new-instance v5, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;

    invoke-direct {v5}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;-><init>()V

    const v6, -0x7f9b1f70

    .line 1225
    invoke-virtual {v5, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setColor(I)V

    .line 1226
    sget v7, Lcom/daaw/avee/Design/VisualizerThemes;->textBlendMode:I

    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setBlendMode(I)V

    const/16 v7, 0x3c

    .line 1227
    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setFontSize(I)V

    const-string v7, "{Artist}"

    .line 1228
    invoke-virtual {v5, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setText(Ljava/lang/String;)V

    const/high16 v7, 0x3f000000    # 0.5f

    .line 1229
    invoke-virtual {v5, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setPosition(FF)V

    const v8, 0x3fb33333    # 1.4f

    .line 1230
    invoke-virtual {v5, v7, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setLocalPosition(FF)V

    .line 1232
    new-instance v8, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;

    invoke-direct {v8}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;-><init>()V

    .line 1233
    invoke-virtual {v8, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setColor(I)V

    .line 1234
    sget v6, Lcom/daaw/avee/Design/VisualizerThemes;->textBlendMode:I

    invoke-virtual {v8, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setBlendMode(I)V

    const/16 v6, 0x28

    .line 1235
    invoke-virtual {v8, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setFontSize(I)V

    const-string v6, "{Title}"

    .line 1236
    invoke-virtual {v8, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setText(Ljava/lang/String;)V

    .line 1237
    invoke-virtual {v8, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setPosition(FF)V

    const v6, -0x3ff9999a    # -2.1f

    .line 1238
    invoke-virtual {v8, v7, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/TextElement;->setLocalPosition(FF)V

    .line 1240
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v6}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 1241
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathHorizontalLine;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathHorizontalLine;-><init>()V

    invoke-virtual {v6, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 1242
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;-><init>()V

    const v10, 0x3f333333    # 0.7f

    invoke-virtual {v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setBarWidth(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    move-result-object v9

    invoke-virtual {v9, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;

    move-result-object v9

    const v10, -0x7f000001

    invoke-virtual {v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBar;->setColor(I)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v9

    invoke-virtual {v6, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 1243
    invoke-virtual {v6, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    const/high16 v7, -0x40800000    # -1.0f

    .line 1244
    invoke-virtual {v6, v4, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    const v7, 0x3b449ba6    # 0.003f

    .line 1245
    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    const/high16 v7, 0x40000000    # 2.0f

    .line 1246
    invoke-virtual {v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    .line 1248
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    const v9, -0xd98744

    .line 1249
    invoke-virtual {v7, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    .line 1250
    invoke-virtual {v7, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    const/4 v9, 0x0

    .line 1251
    invoke-virtual {v7, v9, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    const/high16 v4, 0x40d00000    # 6.5f

    const/high16 v9, 0x41200000    # 10.0f

    .line 1252
    invoke-virtual {v7, v2, v4, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    const/4 v4, 0x2

    const/high16 v9, 0x41180000    # 9.5f

    const/high16 v10, 0x41a00000    # 20.0f

    .line 1253
    invoke-virtual {v7, v4, v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    .line 1254
    invoke-virtual {v7, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    .line 1256
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>()V

    .line 1257
    invoke-virtual {p0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    .line 1258
    invoke-virtual {v4, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1259
    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1260
    invoke-virtual {v4, v8}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1262
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1263
    invoke-virtual {p0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1264
    invoke-virtual {p0, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1266
    invoke-static {p0, v1, v2}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p0

    return-object p0
.end method

.method static createVisPreset9(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 16

    .line 1274
    invoke-static/range {p0 .. p0}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    .line 1276
    new-instance v1, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;

    invoke-direct {v1}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;-><init>()V

    .line 1277
    new-instance v12, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;

    invoke-direct {v12}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;-><init>()V

    const/4 v13, 0x2

    .line 1278
    invoke-virtual {v12, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setDataMode(I)V

    const/16 v2, 0xb

    .line 1279
    invoke-virtual {v12, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleInCountPower(I)V

    const/16 v3, 0xc8

    const/high16 v4, 0x41700000    # 15.0f

    const v5, 0x44898000    # 1100.0f

    const/4 v6, 0x1

    const/4 v7, 0x1

    const/high16 v8, 0x3f800000    # 1.0f

    const/16 v9, 0xf

    const/16 v10, 0xf

    const/4 v11, 0x0

    move-object v2, v12

    .line 1281
    invoke-virtual/range {v2 .. v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSampleOutCount(IFFZIFIIF)V

    const/high16 v2, 0x428c0000    # 70.0f

    .line 1283
    invoke-virtual {v12, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setSteadySmooth(F)V

    const/4 v2, 0x4

    const/high16 v3, 0x40000000    # 2.0f

    .line 1286
    invoke-virtual {v12, v2, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setFftFilter(IF)V

    const v2, 0x3e99999a    # 0.3f

    .line 1287
    invoke-virtual {v12, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentAudioSpectrumData;->setAweightFft(F)V

    .line 1288
    invoke-virtual {v1, v12}, Lcom/daaw/avee/comp/Visualizer/Elements/AudioDataProviderElement;->setSegmentDataProvider(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentDataProvider;)V

    .line 1290
    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v3}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    const v4, 0x3f99999a    # 1.2f

    .line 1291
    invoke-virtual {v3, v4, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    const/4 v4, -0x1

    .line 1292
    invoke-virtual {v3, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColor(I)V

    const/high16 v4, -0x1000000

    .line 1293
    invoke-virtual {v3, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setColorTo(I)V

    const/4 v5, 0x1

    .line 1295
    invoke-virtual {v3, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setAlbumArtGenerateHint(I)V

    .line 1296
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v7, -0x42333333    # -0.1f

    const-string v8, "Beat"

    invoke-direct {v6, v8, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 1297
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v6, v8, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setMeasureColor(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    const/4 v6, 0x0

    .line 1298
    invoke-virtual {v3, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 1301
    new-instance v9, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;

    invoke-direct {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;-><init>()V

    const/high16 v10, 0x3f000000    # 0.5f

    .line 1302
    invoke-virtual {v9, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPosition(FF)V

    const/16 v11, 0x3e8

    .line 1304
    invoke-virtual {v9, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesCountLimit(I)V

    const v11, 0x3ca3d70a    # 0.02f

    .line 1305
    invoke-virtual {v9, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesSpawnTime(F)V

    .line 1307
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    invoke-direct {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;-><init>()V

    invoke-virtual {v11, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;->setVectorZ(F)Lcom/daaw/avee/comp/Visualizer/Elements/Particles/AreaRect;

    move-result-object v11

    invoke-virtual {v9, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setArea(Lcom/daaw/avee/comp/Visualizer/Elements/Base/IArea;)V

    .line 1308
    invoke-virtual {v9, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setBlendMode(I)V

    .line 1309
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v14, 0x3d4ccccd    # 0.05f

    invoke-direct {v11, v8, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v9, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setMeasureOverallSpeed(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 1310
    invoke-virtual {v9, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setMirrorX(Z)V

    .line 1311
    invoke-virtual {v9, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setParticlesScale(F)V

    .line 1312
    sget-object v11, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->internalParticles:[Ljava/lang/String;

    aget-object v11, v11, v5

    invoke-virtual {v9, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setCustomImage(Ljava/lang/String;)V

    const/high16 v11, 0x44610000    # 900.0f

    .line 1313
    invoke-virtual {v9, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPerspectiveDepth(F)V

    const/high16 v11, 0x42b40000    # 90.0f

    .line 1314
    invoke-virtual {v9, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->setPerspectiveFov(F)V

    .line 1316
    invoke-virtual {v9}, Lcom/daaw/avee/comp/Visualizer/Elements/ParticlesElement;->getParticlesFactory()Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;

    move-result-object v11

    const v14, -0x33333334

    .line 1317
    invoke-virtual {v11, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setColorBoth(I)V

    const/high16 v14, 0x41000000    # 8.0f

    .line 1318
    invoke-virtual {v11, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setLifetime(F)V

    const v14, 0x3dcccccd    # 0.1f

    .line 1319
    invoke-virtual {v11, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInAndOutTime(F)V

    const/4 v15, 0x0

    .line 1320
    invoke-virtual {v11, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setStartSize(F)V

    const/high16 v13, 0x40800000    # 4.0f

    .line 1321
    invoke-virtual {v11, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setFadeInSize(F)V

    .line 1322
    invoke-virtual {v11, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSize(F)V

    .line 1323
    invoke-virtual {v11, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setEndSizeRandom(F)V

    const/high16 v13, 0x42c80000    # 100.0f

    .line 1324
    invoke-virtual {v11, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeed(F)V

    .line 1325
    invoke-virtual {v11, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setSpeedRandom(F)V

    .line 1326
    invoke-virtual {v11, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Particles/BasicParticleFactory;->setTrailLength(F)V

    .line 1396
    new-instance v11, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;

    invoke-direct {v11}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;-><init>()V

    .line 1397
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;

    invoke-direct {v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentPathCircle;-><init>()V

    invoke-virtual {v11, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentPath(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentPath;)V

    .line 1398
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    invoke-virtual {v13, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    move-result-object v13

    const/high16 v14, -0x160000

    const v15, -0x333400

    invoke-virtual {v13, v14, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setColor(II)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v13

    invoke-virtual {v11, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 1399
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    invoke-direct {v13}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;-><init>()V

    invoke-virtual {v13, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setMirror(Z)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;

    move-result-object v13

    const v14, -0x103900

    const v15, -0x251600

    invoke-virtual {v13, v14, v15}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererLine;->setColor(II)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v13

    const/high16 v14, 0x40a00000    # 5.0f

    invoke-virtual {v13, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;->setFixedLineHeight(F)Lcom/daaw/avee/comp/Visualizer/Elements/Segment/SegmentRendererBase;

    move-result-object v13

    invoke-virtual {v11, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSegmentRenderer2(Lcom/daaw/avee/comp/Visualizer/Elements/Segment/ISegmentRenderer;)V

    .line 1400
    invoke-virtual {v11, v10, v10}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setPosition(FF)V

    const v13, 0x3eca3d71    # 0.395f

    .line 1401
    invoke-virtual {v11, v13, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScale(FF)V

    .line 1403
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v14, 0x3e19999a    # 0.15f

    invoke-direct {v13, v8, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v11, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    const v13, 0x3c23d70a    # 0.01f

    .line 1404
    invoke-virtual {v11, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMinBarHeightScale(F)V

    const/high16 v13, 0x40400000    # 3.0f

    .line 1405
    invoke-virtual {v11, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setBarHeightScale(F)V

    const/16 v13, 0xa

    .line 1406
    invoke-virtual {v11, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setSoftness(I)V

    .line 1407
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const-string v15, "ConstantShake"

    invoke-direct {v13, v15, v2, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v11, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMeasurePos(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 1408
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v14, 0x3e4ccccd    # 0.2f

    const/high16 v10, 0x3e800000    # 0.25f

    const-string v2, "ConstantShakeRotLess"

    invoke-direct {v13, v2, v10, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v11, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/SegmentElement;->setMeasureRot(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 1410
    new-instance v13, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;

    invoke-direct {v13}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;-><init>()V

    .line 1411
    invoke-virtual {v13, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setRenderContentOnTop(Z)V

    .line 1413
    invoke-virtual {v13, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setColor2(I)V

    const/4 v4, 0x2

    .line 1414
    invoke-virtual {v13, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlendMode(I)V

    .line 1415
    invoke-virtual {v13, v6, v7, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/BlurEffectElement;->setBlurLayerScale(IFF)V

    .line 1417
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;

    invoke-direct {v4}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;-><init>()V

    .line 1418
    invoke-virtual {v4, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurAmount(Z)V

    .line 1419
    invoke-virtual {v4, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setBlurredBorder(Z)V

    .line 1420
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v10, 0x3e99999a    # 0.3f

    invoke-direct {v6, v15, v10, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v4, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setMeasurePos(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    const/high16 v6, 0x3f000000    # 0.5f

    .line 1421
    invoke-virtual {v4, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setPosition(FF)V

    const v6, 0x3ecccccd    # 0.4f

    .line 1422
    invoke-virtual {v4, v6, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScale(FF)V

    .line 1423
    invoke-virtual {v4, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setLocalPositionUniform(ZZ)V

    .line 1424
    invoke-virtual {v4, v5, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleUniform(ZZ)V

    .line 1425
    invoke-virtual {v4, v5}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setCircleShape(Z)V

    .line 1427
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const v7, 0x3e19999a    # 0.15f

    invoke-direct {v6, v8, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v4, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setScaleMeasure(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 1428
    new-instance v6, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;

    const/high16 v7, 0x3e800000    # 0.25f

    invoke-direct {v6, v2, v7, v14}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v4, v6}, Lcom/daaw/avee/comp/Visualizer/Elements/ImageElement;->setMeasureRot(Lcom/daaw/avee/comp/Visualizer/Elements/Base/MeasuredVar;)V

    .line 1430
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;

    invoke-direct {v2}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;-><init>()V

    .line 1431
    invoke-virtual {v0, v2}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Composition;)V

    .line 1432
    invoke-virtual {v2, v9}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->addChildAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1435
    invoke-virtual {v0, v1}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1436
    invoke-virtual {v0, v3}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1437
    invoke-virtual {v0, v13}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1438
    invoke-virtual {v0, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1439
    invoke-virtual {v0, v11}, Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;->addToCompositionAtEnd(Lcom/daaw/avee/comp/Visualizer/Elements/Base/Element;)V

    .line 1441
    invoke-static {v0, v12, v5}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object v0

    return-object v0
.end method

.method private getThemeObject(IZ)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 0

    if-ltz p1, :cond_1

    .line 252
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-lt p1, p2, :cond_0

    goto :goto_0

    .line 254
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/daaw/avee/Common/Tuple2;

    iget-object p2, p2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast p2, Lcom/daaw/avee/Design/VisualizerThemes$IVisualizerFactory;

    invoke-interface {p2, p1}, Lcom/daaw/avee/Design/VisualizerThemes$IVisualizerFactory;->create(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private getThemeObject2(IZ)Lcom/daaw/avee/comp/Visualizer/CustomScene;
    .locals 0

    .line 262
    invoke-direct {p0, p1, p2}, Lcom/daaw/avee/Design/VisualizerThemes;->getThemeObject2Pure(IZ)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 265
    invoke-virtual {p2, p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->setBasedOnTemplate(I)V

    :cond_0
    return-object p2
.end method

.method private getThemeObject2Pure(IZ)Lcom/daaw/avee/comp/Visualizer/CustomScene;
    .locals 1

    .line 272
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object p2

    invoke-virtual {p2}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object p2

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    .line 274
    :cond_0
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    packed-switch p1, :pswitch_data_0

    return-object v0

    :pswitch_0
    const p1, 0x7f0f002a

    .line 315
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_1
    const p1, 0x7f0f0029

    .line 313
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_2
    const p1, 0x7f0f0028

    .line 311
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_3
    const p1, 0x7f0f0027

    .line 308
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_4
    const p1, 0x7f0f0026

    .line 306
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_5
    const p1, 0x7f0f0025

    .line 304
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_6
    const p1, 0x7f0f0024

    .line 302
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_7
    const p1, 0x7f0f0023

    .line 300
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_8
    const p1, 0x7f0f0032

    .line 297
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_9
    const p1, 0x7f0f0031

    .line 295
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_a
    const p1, 0x7f0f0030

    .line 293
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_b
    const p1, 0x7f0f002f

    .line 291
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_c
    const p1, 0x7f0f002e

    .line 289
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_d
    const p1, 0x7f0f002d

    .line 286
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_e
    const p1, 0x7f0f002c

    .line 284
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_f
    const p1, 0x7f0f002b

    .line 282
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_10
    const p1, 0x7f0f0022

    .line 280
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_11
    const p1, 0x7f0f0021

    .line 278
    invoke-static {p2, p1}, Lcom/daaw/avee/Common/UtilsFileSys;->readResource(Landroid/content/res/Resources;I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/CustomScene;->CreateFromString(Ljava/lang/String;)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 0

    return-object p0
.end method

.method public static s()Lcom/daaw/avee/Design/VisualizerThemes;
    .locals 1

    .line 87
    sget-object v0, Lcom/daaw/avee/Design/VisualizerThemes;->instance:Lcom/daaw/avee/Design/VisualizerThemes;

    if-nez v0, :cond_0

    .line 88
    new-instance v0, Lcom/daaw/avee/Design/VisualizerThemes;

    invoke-direct {v0}, Lcom/daaw/avee/Design/VisualizerThemes;-><init>()V

    .line 90
    :cond_0
    sget-object v0, Lcom/daaw/avee/Design/VisualizerThemes;->instance:Lcom/daaw/avee/Design/VisualizerThemes;

    return-object v0
.end method

.method static templateName(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "T"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "_"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getThemeObject2(I)Lcom/daaw/avee/comp/Visualizer/CustomScene;
    .locals 1

    const/4 v0, 0x0

    .line 258
    invoke-direct {p0, p1, v0}, Lcom/daaw/avee/Design/VisualizerThemes;->getThemeObject2(IZ)Lcom/daaw/avee/comp/Visualizer/CustomScene;

    move-result-object p1

    return-object p1
.end method

.method public getThemeObjectForLoading(IZLjava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 0

    .line 336
    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x0

    .line 337
    invoke-static {p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p1

    return-object p1
.end method

.method public getThemeObjectForLoading2(IZLjava/lang/String;)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;
    .locals 0

    .line 347
    invoke-static {p1}, Lcom/daaw/avee/Design/VisualizerThemes;->createDefaultRoot(I)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x0

    .line 348
    invoke-static {p1, p2, p3}, Lcom/daaw/avee/Design/VisualizerThemes;->onFinishedDefaultRoot(Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;Lcom/daaw/avee/comp/Visualizer/Elements/Base/IFrameDataProvider;Z)Lcom/daaw/avee/comp/Visualizer/Elements/RootElement;

    move-result-object p1

    return-object p1
.end method

.method public getThemesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "Lcom/daaw/avee/comp/Common/VisualizerThemeInfo;",
            "Lcom/daaw/avee/Design/VisualizerThemes$IVisualizerFactory2;",
            ">;>;"
        }
    .end annotation

    .line 247
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList2:Ljava/util/List;

    return-object v0
.end method

.method public isTemplateIndex(I)Z
    .locals 1

    .line 243
    iget-object v0, p0, Lcom/daaw/avee/Design/VisualizerThemes;->themesList2:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
