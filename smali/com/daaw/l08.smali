.class public final Lcom/daaw/l08;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/m08;


# static fields
.field public static final c:Ljava/lang/Object;


# instance fields
.field public volatile a:Lcom/daaw/m08;

.field public volatile b:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/l08;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/m08;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/daaw/l08;->c:Ljava/lang/Object;

    iput-object v0, p0, Lcom/daaw/l08;->b:Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/l08;->a:Lcom/daaw/m08;

    return-void
.end method

.method public static a(Lcom/daaw/m08;)Lcom/daaw/m08;
    .locals 1

    instance-of v0, p0, Lcom/daaw/l08;

    if-nez v0, :cond_1

    instance-of v0, p0, Lcom/daaw/vz7;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/l08;

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v0, p0}, Lcom/daaw/l08;-><init>(Lcom/daaw/m08;)V

    return-object v0

    :cond_1
    :goto_0
    return-object p0
.end method


# virtual methods
.method public final zzb()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/l08;->b:Ljava/lang/Object;

    sget-object v1, Lcom/daaw/l08;->c:Ljava/lang/Object;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/daaw/l08;->a:Lcom/daaw/m08;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/l08;->b:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/l08;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/l08;->a:Lcom/daaw/m08;

    :cond_1
    :goto_0
    return-object v0
.end method
