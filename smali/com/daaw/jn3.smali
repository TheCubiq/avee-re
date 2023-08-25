.class public Lcom/daaw/jn3;
.super Ljava/lang/Exception;
.source ""


# static fields
.field public static final r:Lcom/daaw/th8;


# instance fields
.field public final p:I

.field public final q:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/daaw/gm3;->a:Lcom/daaw/gm3;

    sput-object v0, Lcom/daaw/jn3;->r:Lcom/daaw/th8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;IJ)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput p3, p0, Lcom/daaw/jn3;->p:I

    iput-wide p4, p0, Lcom/daaw/jn3;->q:J

    return-void
.end method
