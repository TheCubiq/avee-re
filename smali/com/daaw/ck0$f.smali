.class public Lcom/daaw/ck0$f;
.super Landroid/database/DataSetObserver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ck0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ck0;


# direct methods
.method public constructor <init>(Lcom/daaw/ck0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ck0$f;->a:Lcom/daaw/ck0;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ck0$f;->a:Lcom/daaw/ck0;

    invoke-virtual {v0}, Lcom/daaw/ck0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/ck0$f;->a:Lcom/daaw/ck0;

    invoke-virtual {v0}, Lcom/daaw/ck0;->h()V

    :cond_0
    return-void
.end method

.method public onInvalidated()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ck0$f;->a:Lcom/daaw/ck0;

    invoke-virtual {v0}, Lcom/daaw/ck0;->dismiss()V

    return-void
.end method
