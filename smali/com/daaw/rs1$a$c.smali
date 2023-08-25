.class public Lcom/daaw/rs1$a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/rs1$a;->f(Lcom/google/android/exoplayer2/Format;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/google/android/exoplayer2/Format;

.field public final synthetic q:Lcom/daaw/rs1$a;


# direct methods
.method public constructor <init>(Lcom/daaw/rs1$a;Lcom/google/android/exoplayer2/Format;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rs1$a$c;->q:Lcom/daaw/rs1$a;

    iput-object p2, p0, Lcom/daaw/rs1$a$c;->p:Lcom/google/android/exoplayer2/Format;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/rs1$a$c;->q:Lcom/daaw/rs1$a;

    invoke-static {v0}, Lcom/daaw/rs1$a;->a(Lcom/daaw/rs1$a;)Lcom/daaw/rs1;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/rs1$a$c;->p:Lcom/google/android/exoplayer2/Format;

    invoke-interface {v0, v1}, Lcom/daaw/rs1;->x(Lcom/google/android/exoplayer2/Format;)V

    return-void
.end method
