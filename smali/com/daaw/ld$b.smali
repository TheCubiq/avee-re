.class public Lcom/daaw/ld$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ld;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/b30$c;

.field public final synthetic q:I

.field public final synthetic r:Lcom/daaw/ld;


# direct methods
.method public constructor <init>(Lcom/daaw/ld;Lcom/daaw/b30$c;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ld$b;->r:Lcom/daaw/ld;

    iput-object p2, p0, Lcom/daaw/ld$b;->p:Lcom/daaw/b30$c;

    iput p3, p0, Lcom/daaw/ld$b;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ld$b;->p:Lcom/daaw/b30$c;

    iget v1, p0, Lcom/daaw/ld$b;->q:I

    invoke-virtual {v0, v1}, Lcom/daaw/b30$c;->a(I)V

    return-void
.end method
