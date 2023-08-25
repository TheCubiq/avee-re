.class public abstract Lcom/daaw/my;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/my$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/daaw/my;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lcom/daaw/my;->a()Lcom/daaw/my$a;

    move-result-object v0

    const-wide/32 v1, 0xa00000

    invoke-virtual {v0, v1, v2}, Lcom/daaw/my$a;->f(J)Lcom/daaw/my$a;

    move-result-object v0

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lcom/daaw/my$a;->d(I)Lcom/daaw/my$a;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Lcom/daaw/my$a;->b(I)Lcom/daaw/my$a;

    move-result-object v0

    const-wide/32 v1, 0x240c8400

    invoke-virtual {v0, v1, v2}, Lcom/daaw/my$a;->c(J)Lcom/daaw/my$a;

    move-result-object v0

    const v1, 0x14000

    invoke-virtual {v0, v1}, Lcom/daaw/my$a;->e(I)Lcom/daaw/my$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/my$a;->a()Lcom/daaw/my;

    move-result-object v0

    sput-object v0, Lcom/daaw/my;->a:Lcom/daaw/my;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/daaw/my$a;
    .locals 1

    new-instance v0, Lcom/daaw/d9$b;

    invoke-direct {v0}, Lcom/daaw/d9$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method

.method public abstract c()J
.end method

.method public abstract d()I
.end method

.method public abstract e()I
.end method

.method public abstract f()J
.end method
