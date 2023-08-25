.class public final Lcom/daaw/kq$f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/kq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public final a:Lcom/daaw/zw0;

.field public final b:J

.field public final c:J


# direct methods
.method public constructor <init>(Lcom/daaw/zw0;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kq$f;->a:Lcom/daaw/zw0;

    iput-wide p2, p0, Lcom/daaw/kq$f;->b:J

    iput-wide p4, p0, Lcom/daaw/kq$f;->c:J

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/zw0;JJLcom/daaw/kq$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/daaw/kq$f;-><init>(Lcom/daaw/zw0;JJ)V

    return-void
.end method

.method public static synthetic a(Lcom/daaw/kq$f;)Lcom/daaw/zw0;
    .locals 0

    iget-object p0, p0, Lcom/daaw/kq$f;->a:Lcom/daaw/zw0;

    return-object p0
.end method

.method public static synthetic b(Lcom/daaw/kq$f;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/kq$f;->c:J

    return-wide v0
.end method

.method public static synthetic c(Lcom/daaw/kq$f;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/kq$f;->b:J

    return-wide v0
.end method
