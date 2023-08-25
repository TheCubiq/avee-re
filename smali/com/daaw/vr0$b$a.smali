.class public Lcom/daaw/vr0$b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/vr0$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:Z

.field public c:I

.field public final synthetic d:Lcom/daaw/vr0$b;


# direct methods
.method public constructor <init>(Lcom/daaw/vr0$b;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vr0$b$a;->d:Lcom/daaw/vr0$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lcom/daaw/vr0$b$a;->a:I

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/vr0$b$a;->b:Z

    iput p1, p0, Lcom/daaw/vr0$b$a;->c:I

    return-void
.end method
