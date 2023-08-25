.class public final Lcom/daaw/q70;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/q70$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/daaw/q70;


# instance fields
.field public final a:Lcom/daaw/zf1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/q70$a;

    invoke-direct {v0}, Lcom/daaw/q70$a;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/q70$a;->a()Lcom/daaw/q70;

    move-result-object v0

    sput-object v0, Lcom/daaw/q70;->b:Lcom/daaw/q70;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/zf1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/q70;->a:Lcom/daaw/zf1;

    return-void
.end method

.method public static b()Lcom/daaw/q70$a;
    .locals 1

    new-instance v0, Lcom/daaw/q70$a;

    invoke-direct {v0}, Lcom/daaw/q70$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lcom/daaw/zf1;
    .locals 1
    .annotation build Lcom/daaw/uz0;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lcom/daaw/q70;->a:Lcom/daaw/zf1;

    return-object v0
.end method
