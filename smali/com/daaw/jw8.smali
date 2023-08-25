.class public final Lcom/daaw/jw8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lcom/daaw/lw8;

.field public c:Z


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/daaw/lw8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/jw8;->a:Landroid/os/Handler;

    iput-object p2, p0, Lcom/daaw/jw8;->b:Lcom/daaw/lw8;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/jw8;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/daaw/jw8;->a:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/jw8;)Lcom/daaw/lw8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/jw8;->b:Lcom/daaw/lw8;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/jw8;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/jw8;->c:Z

    return p0
.end method


# virtual methods
.method public final c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/jw8;->c:Z

    return-void
.end method
