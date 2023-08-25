.class public Lcom/daaw/ck0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ck0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/ck0;


# direct methods
.method public constructor <init>(Lcom/daaw/ck0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ck0$e;->p:Lcom/daaw/ck0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ck0$e;->p:Lcom/daaw/ck0;

    invoke-virtual {v0}, Lcom/daaw/ck0;->r()V

    return-void
.end method
