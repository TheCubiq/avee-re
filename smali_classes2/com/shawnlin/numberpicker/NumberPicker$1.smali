.class Lcom/shawnlin/numberpicker/NumberPicker$1;
.super Ljava/lang/Object;
.source "NumberPicker.java"

# interfaces
.implements Lcom/shawnlin/numberpicker/NumberPicker$Formatter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shawnlin/numberpicker/NumberPicker;->stringToFormatter(Ljava/lang/String;)Lcom/shawnlin/numberpicker/NumberPicker$Formatter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shawnlin/numberpicker/NumberPicker;

.field final synthetic val$formatter:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/shawnlin/numberpicker/NumberPicker;Ljava/lang/String;)V
    .locals 0

    .line 2303
    iput-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker$1;->this$0:Lcom/shawnlin/numberpicker/NumberPicker;

    iput-object p2, p0, Lcom/shawnlin/numberpicker/NumberPicker$1;->val$formatter:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public format(I)Ljava/lang/String;
    .locals 4

    .line 2306
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    iget-object v1, p0, Lcom/shawnlin/numberpicker/NumberPicker$1;->val$formatter:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
