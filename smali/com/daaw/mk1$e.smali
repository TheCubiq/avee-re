.class public Lcom/daaw/mk1$e;
.super Lcom/daaw/mk1$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/mk1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final b:Z


# direct methods
.method public constructor <init>(Lcom/daaw/mk1$c;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/mk1$d;-><init>(Lcom/daaw/mk1$c;)V

    iput-boolean p2, p0, Lcom/daaw/mk1$e;->b:Z

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/mk1$e;->b:Z

    return v0
.end method
