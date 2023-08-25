.class public Lcom/daaw/in1$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/in1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Landroid/view/View;

.field public b:Ljava/lang/String;

.field public c:Lcom/daaw/on1;

.field public d:Lcom/daaw/ox1;

.field public e:Lcom/daaw/in1;


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/String;Lcom/daaw/in1;Lcom/daaw/ox1;Lcom/daaw/on1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/in1$d;->a:Landroid/view/View;

    iput-object p2, p0, Lcom/daaw/in1$d;->b:Ljava/lang/String;

    iput-object p5, p0, Lcom/daaw/in1$d;->c:Lcom/daaw/on1;

    iput-object p4, p0, Lcom/daaw/in1$d;->d:Lcom/daaw/ox1;

    iput-object p3, p0, Lcom/daaw/in1$d;->e:Lcom/daaw/in1;

    return-void
.end method
