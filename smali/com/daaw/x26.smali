.class public final Lcom/daaw/x26;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/h76;


# instance fields
.field public final a:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/x26;->a:J

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Landroid/os/Bundle;

    iget-wide v0, p0, Lcom/daaw/x26;->a:J

    const-string v2, "cldut"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    return-void
.end method
