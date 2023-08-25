.class public Lcom/daaw/n7$a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/n7$a;->g(Lcom/google/android/exoplayer2/Format;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/google/android/exoplayer2/Format;

.field public final synthetic q:Lcom/daaw/n7$a;


# direct methods
.method public constructor <init>(Lcom/daaw/n7$a;Lcom/google/android/exoplayer2/Format;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n7$a$c;->q:Lcom/daaw/n7$a;

    iput-object p2, p0, Lcom/daaw/n7$a$c;->p:Lcom/google/android/exoplayer2/Format;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/n7$a$c;->q:Lcom/daaw/n7$a;

    invoke-static {v0}, Lcom/daaw/n7$a;->a(Lcom/daaw/n7$a;)Lcom/daaw/n7;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/n7$a$c;->p:Lcom/google/android/exoplayer2/Format;

    invoke-interface {v0, v1}, Lcom/daaw/n7;->z(Lcom/google/android/exoplayer2/Format;)V

    return-void
.end method
