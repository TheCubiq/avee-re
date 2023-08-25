.class public final Lcom/daaw/a30$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/a30$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/a30;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final a:Lcom/daaw/x20;

.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/x20;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/a30$e;->a:Lcom/daaw/x20;

    iput p2, p0, Lcom/daaw/a30$e;->c:I

    iput p3, p0, Lcom/daaw/a30$e;->b:I

    iput-object p4, p0, Lcom/daaw/a30$e;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/daaw/a30$e;->c:I

    return v0
.end method

.method public b()Lcom/daaw/x20;
    .locals 1

    iget-object v0, p0, Lcom/daaw/a30$e;->a:Lcom/daaw/x20;

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/a30$e;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/daaw/a30$e;->b:I

    return v0
.end method
