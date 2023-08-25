.class public Lcom/daaw/pz;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Z

.field public b:Ljava/nio/ByteBuffer;

.field public c:J

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:J


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/pz;->a:Z

    const/16 v0, 0x10

    iput v0, p0, Lcom/daaw/pz;->g:I

    return-void
.end method
