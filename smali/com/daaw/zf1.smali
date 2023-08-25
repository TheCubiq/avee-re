.class public final Lcom/daaw/zf1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/zf1$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/daaw/zf1;


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/zf1$a;

    invoke-direct {v0}, Lcom/daaw/zf1$a;-><init>()V

    invoke-virtual {v0}, Lcom/daaw/zf1$a;->a()Lcom/daaw/zf1;

    move-result-object v0

    sput-object v0, Lcom/daaw/zf1;->c:Lcom/daaw/zf1;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/zf1;->a:J

    iput-wide p3, p0, Lcom/daaw/zf1;->b:J

    return-void
.end method

.method public static c()Lcom/daaw/zf1$a;
    .locals 1

    new-instance v0, Lcom/daaw/zf1$a;

    invoke-direct {v0}, Lcom/daaw/zf1$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation build Lcom/daaw/uz0;
        tag = 0x1
    .end annotation

    iget-wide v0, p0, Lcom/daaw/zf1;->a:J

    return-wide v0
.end method

.method public b()J
    .locals 2
    .annotation build Lcom/daaw/uz0;
        tag = 0x2
    .end annotation

    iget-wide v0, p0, Lcom/daaw/zf1;->b:J

    return-wide v0
.end method
