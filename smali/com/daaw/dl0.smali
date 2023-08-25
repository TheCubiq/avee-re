.class public final Lcom/daaw/dl0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/dl0$b;,
        Lcom/daaw/dl0$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/daaw/dl0;


# instance fields
.field public final a:J

.field public final b:Lcom/daaw/dl0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/dl0$a;

    invoke-direct {v0}, Lcom/daaw/dl0$a;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/dl0$a;->a()Lcom/daaw/dl0;

    move-result-object v0

    sput-object v0, Lcom/daaw/dl0;->c:Lcom/daaw/dl0;

    return-void
.end method

.method public constructor <init>(JLcom/daaw/dl0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/dl0;->a:J

    iput-object p3, p0, Lcom/daaw/dl0;->b:Lcom/daaw/dl0$b;

    return-void
.end method

.method public static c()Lcom/daaw/dl0$a;
    .locals 1

    new-instance v0, Lcom/daaw/dl0$a;

    invoke-direct {v0}, Lcom/daaw/dl0$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation build Lcom/daaw/uz0;
        tag = 0x1
    .end annotation

    iget-wide v0, p0, Lcom/daaw/dl0;->a:J

    return-wide v0
.end method

.method public b()Lcom/daaw/dl0$b;
    .locals 1
    .annotation build Lcom/daaw/uz0;
        tag = 0x3
    .end annotation

    iget-object v0, p0, Lcom/daaw/dl0;->b:Lcom/daaw/dl0$b;

    return-object v0
.end method
