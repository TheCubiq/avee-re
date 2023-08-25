.class public Lcom/shawnlin/numberpicker/NumberPicker$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/shawnlin/numberpicker/NumberPicker$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shawnlin/numberpicker/NumberPicker;->J(Ljava/lang/String;)Lcom/shawnlin/numberpicker/NumberPicker$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/shawnlin/numberpicker/NumberPicker;


# direct methods
.method public constructor <init>(Lcom/shawnlin/numberpicker/NumberPicker;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker$a;->b:Lcom/shawnlin/numberpicker/NumberPicker;

    iput-object p2, p0, Lcom/shawnlin/numberpicker/NumberPicker$a;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 4

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    iget-object v1, p0, Lcom/shawnlin/numberpicker/NumberPicker$a;->a:Ljava/lang/String;

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
