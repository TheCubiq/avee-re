.class public final Lcom/daaw/me$c;
.super Lcom/daaw/yh1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/me;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final synthetic u:Lcom/daaw/me;


# direct methods
.method public constructor <init>(Lcom/daaw/me;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/me$c;->u:Lcom/daaw/me;

    invoke-direct {p0}, Lcom/daaw/yh1;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/me;Lcom/daaw/me$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/me$c;-><init>(Lcom/daaw/me;)V

    return-void
.end method


# virtual methods
.method public final m()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/me$c;->u:Lcom/daaw/me;

    invoke-virtual {v0, p0}, Lcom/daaw/me;->m(Lcom/daaw/yh1;)V

    return-void
.end method
