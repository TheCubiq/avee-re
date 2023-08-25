.class public abstract Lcom/daaw/kd;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ci0;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/kd$a;
    }
.end annotation


# static fields
.field public static final v:Ljava/lang/Object;


# instance fields
.field public transient p:Lcom/daaw/ci0;

.field public final q:Ljava/lang/Object;

.field public final r:Ljava/lang/Class;

.field public final s:Ljava/lang/String;

.field public final t:Ljava/lang/String;

.field public final u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/daaw/kd$a;->a()Lcom/daaw/kd$a;

    move-result-object v0

    sput-object v0, Lcom/daaw/kd;->v:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lcom/daaw/kd;->v:Ljava/lang/Object;

    invoke-direct {p0, v0}, Lcom/daaw/kd;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/kd;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kd;->q:Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/kd;->r:Ljava/lang/Class;

    iput-object p3, p0, Lcom/daaw/kd;->s:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/kd;->t:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/daaw/kd;->u:Z

    return-void
.end method


# virtual methods
.method public b()Lcom/daaw/ci0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/kd;->p:Lcom/daaw/ci0;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/kd;->c()Lcom/daaw/ci0;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/kd;->p:Lcom/daaw/ci0;

    :cond_0
    return-object v0
.end method

.method public abstract c()Lcom/daaw/ci0;
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/kd;->q:Ljava/lang/Object;

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/kd;->s:Ljava/lang/String;

    return-object v0
.end method

.method public f()Lcom/daaw/ei0;
    .locals 2

    iget-object v0, p0, Lcom/daaw/kd;->r:Ljava/lang/Class;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/daaw/kd;->u:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Lcom/daaw/m31;->b(Ljava/lang/Class;)Lcom/daaw/ei0;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lcom/daaw/m31;->a(Ljava/lang/Class;)Lcom/daaw/di0;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/kd;->t:Ljava/lang/String;

    return-object v0
.end method
