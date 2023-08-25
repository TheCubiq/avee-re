.class public Lcom/daaw/bm$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/an$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/bm;->x(Ljava/lang/String;Ljava/lang/Thread$UncaughtExceptionHandler;Lcom/daaw/zb1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/bm;


# direct methods
.method public constructor <init>(Lcom/daaw/bm;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bm$a;->a:Lcom/daaw/bm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/zb1;Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/bm$a;->a:Lcom/daaw/bm;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/bm;->F(Lcom/daaw/zb1;Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
