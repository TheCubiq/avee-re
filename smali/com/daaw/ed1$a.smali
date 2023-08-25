.class public Lcom/daaw/ed1$a;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ed1;-><init>([Lcom/daaw/gq;[Lcom/daaw/av0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/ed1;


# direct methods
.method public constructor <init>(Lcom/daaw/ed1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ed1$a;->p:Lcom/daaw/ed1;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ed1$a;->p:Lcom/daaw/ed1;

    invoke-static {v0}, Lcom/daaw/ed1;->f(Lcom/daaw/ed1;)V

    return-void
.end method
