.class public Lcom/shawnlin/numberpicker/NumberPicker$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shawnlin/numberpicker/NumberPicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public p:Z

.field public final synthetic q:Lcom/shawnlin/numberpicker/NumberPicker;


# direct methods
.method public constructor <init>(Lcom/shawnlin/numberpicker/NumberPicker;)V
    .locals 0

    iput-object p1, p0, Lcom/shawnlin/numberpicker/NumberPicker$b;->q:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/shawnlin/numberpicker/NumberPicker$b;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/shawnlin/numberpicker/NumberPicker$b;->b(Z)V

    return-void
.end method


# virtual methods
.method public final b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/shawnlin/numberpicker/NumberPicker$b;->p:Z

    return-void
.end method

.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker$b;->q:Lcom/shawnlin/numberpicker/NumberPicker;

    iget-boolean v1, p0, Lcom/shawnlin/numberpicker/NumberPicker$b;->p:Z

    invoke-static {v0, v1}, Lcom/shawnlin/numberpicker/NumberPicker;->b(Lcom/shawnlin/numberpicker/NumberPicker;Z)V

    iget-object v0, p0, Lcom/shawnlin/numberpicker/NumberPicker$b;->q:Lcom/shawnlin/numberpicker/NumberPicker;

    invoke-static {v0}, Lcom/shawnlin/numberpicker/NumberPicker;->a(Lcom/shawnlin/numberpicker/NumberPicker;)J

    move-result-wide v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/widget/LinearLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
