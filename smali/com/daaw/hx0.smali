.class public Lcom/daaw/hx0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final c:Lcom/daaw/hx0;


# instance fields
.field public final a:J

.field public final b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/daaw/hx0;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/hx0;-><init>(JZ)V

    sput-object v0, Lcom/daaw/hx0;->c:Lcom/daaw/hx0;

    return-void
.end method

.method public constructor <init>(JZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/hx0;->a:J

    iput-boolean p3, p0, Lcom/daaw/hx0;->b:Z

    return-void
.end method
