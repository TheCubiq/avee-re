.class public final Lcom/daaw/n27;
.super Lcom/daaw/b47;
.source ""


# instance fields
.field public final synthetic q:Lcom/daaw/o27;


# direct methods
.method public constructor <init>(Lcom/daaw/o27;Ljava/util/ListIterator;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/n27;->q:Lcom/daaw/o27;

    invoke-direct {p0, p2}, Lcom/daaw/b47;-><init>(Ljava/util/ListIterator;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/y43;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
