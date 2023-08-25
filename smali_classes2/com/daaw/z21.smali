.class public abstract Lcom/daaw/z21;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/z21$a;
    }
.end annotation


# static fields
.field public static final p:Lcom/daaw/z21$a;

.field public static final q:Lcom/daaw/z21;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/z21$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/z21$a;-><init>(Lcom/daaw/pq;)V

    sput-object v0, Lcom/daaw/z21;->p:Lcom/daaw/z21$a;

    sget-object v0, Lcom/daaw/tw0;->a:Lcom/daaw/sw0;

    invoke-virtual {v0}, Lcom/daaw/sw0;->b()Lcom/daaw/z21;

    move-result-object v0

    sput-object v0, Lcom/daaw/z21;->q:Lcom/daaw/z21;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lcom/daaw/z21;
    .locals 1

    sget-object v0, Lcom/daaw/z21;->q:Lcom/daaw/z21;

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method
