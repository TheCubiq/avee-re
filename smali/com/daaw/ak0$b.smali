.class public Lcom/daaw/ak0$b;
.super Lcom/daaw/i6;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ak0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic g:Lcom/daaw/ak0;


# direct methods
.method public constructor <init>(Lcom/daaw/ak0;Lcom/daaw/gd;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ak0$b;->g:Lcom/daaw/ak0;

    invoke-direct {p0}, Lcom/daaw/i6;-><init>()V

    new-instance p1, Lcom/daaw/ee1;

    invoke-direct {p1, p0, p2}, Lcom/daaw/ee1;-><init>(Lcom/daaw/i6;Lcom/daaw/gd;)V

    iput-object p1, p0, Lcom/daaw/i6;->e:Lcom/daaw/i6$a;

    return-void
.end method
